package frc.robot.subsystems.elevator;

import java.util.function.DoubleSupplier;

import static java.lang.Math.*;

public class ElevatorConstants {
    public static int RIGHT_MOTOR_ID = 5; // The number is just a placeholder
    public static int LEFT_MOTOR_ID = 6; // The number is just a placeholder

    public static DoubleSupplier ELEVATOR_ANGLE = () -> PI / 2;

    public static double MAX_VELOCITY = 2; // The number is just a placeholder
    public static double MAX_ACCELERATION = 3; // The number is just a placeholder

    public static double TOLERANCE = 0.01; // The number is just a placeholder

    public static final double MAX_ELEVATOR_HIGHT = 1; // The number is just a placeholder

    public static final double POSITION_CONVERSION_FACTOR = 0; // The number is just a placeholder
    public static final double VELOCITY_CONVERSION_FACTOR = POSITION_CONVERSION_FACTOR;


}