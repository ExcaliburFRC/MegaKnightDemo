package frc.robot.subsystems.intake;

public enum IntakeState {
    FLOOR_INTAKE(0,0,0), // The numbers are just a placeholder
    CENTERLIZE(0,0,0), // The numbers are just a placeholder
    DEFAULT(0,0,0), // The numbers are just a placeholder
    HANDOFF(0,0,0), // The numbers are just a placeholder

    L1_SCORE_PRE(0, 0, 0), // The numbers are just a placeholder
    L1_SCORE(0, 0,0), // The numbers are just a placeholder
    CLIMB(0, 0,0), // The numbers are just a placeholder

    REVERSE_HANDOFF(0, 0, 0), // The numbers are just a placeholder
    EJECT_CORAL(0, 0, 0); // The numbers are just a placeholder

    final double intakeAngle;
    final double rollerVoltage;
    final double centraliserVoltage;

    IntakeState(double intakeAngle, double rollerVoltage, double centraliserVoltage){
        this.intakeAngle = intakeAngle;
        this.rollerVoltage = rollerVoltage;
        this.centraliserVoltage = centraliserVoltage;
    }
}