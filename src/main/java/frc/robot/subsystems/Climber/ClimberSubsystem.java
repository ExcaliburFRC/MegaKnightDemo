package frc.robot.subsystems.climber;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.revrobotics.spark.SparkLowLevel;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.excalib.control.limits.SoftLimit;
import frc.excalib.control.motor.controllers.MotorGroup;
import frc.excalib.control.motor.controllers.SparkMaxMotor;
import frc.excalib.control.motor.controllers.TalonFXMotor;
import frc.excalib.control.motor.motor_specs.IdleState;
import frc.excalib.mechanisms.Arm.Arm;
import frc.excalib.mechanisms.Mechanism;
import monologue.Annotations.Log;
import monologue.Logged;

import java.util.function.DoubleSupplier;

import static frc.robot.subsystems.climber.Constants.*;

public class ClimberSubsystem extends SubsystemBase implements Logged {
    private final TalonFXMotor firstMotor, secondMotor;
    private final SparkMaxMotor rollerMotor;
    private final MotorGroup motorGroup;
    private final Arm climberMechanism;
    private DoubleSupplier setpoint;
    private SoftLimit limit;
    private final Mechanism wheelsMechanism;

    public ClimberSubsystem {
        firstMotor = new TalonFXMotor(MOTOR1_ID);
        secondMotor = new TalonFXMotor(MOTOR2_ID);

        rollerMotor = new SparkMaxMotor(ROLLER_MOTOR_ID, SparkLowLevel.MotorType.kBrushless);

        motorGroup = new MotorGroup(firstMotor, secondMotor);
        
        wheelsMechanism = new Mechanism(rollerMotor);

        motorGroup.setMotorPosition(INITIAL_START_ANGLE);

        climberMechanism = new Arm(motorGroup, motorGroup::getMotorPosition, VELOCITY_SOFTLIMIT, GAINS, MASS);

        setpoint = () -> INITIAL_START_ANGLE;


    }

    public command manualCommend(DoubleSupplier voltageSupplier){
        Command command = climberMechanism.manualCommend(voltageSupplier).alongWith(new RunCommand(()-> rollerMotor.setVoltage(0))) //Just a placeholder number
        command.addRequiremnts(this);
        return command;
    }


}