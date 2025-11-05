package frc.robot.subsystems.arm;

import frc.excalib.control.limits.SoftLimit;

public class ArmConstants {
    public static final int FIRST_MOTOR_ID = 9; // The number is just a placeholder
    public static final int CAN_CODER_ID = 10; // The number is just a placeholder
    public static final SoftLimit VELOCITY_LIMIT = new SoftLimit(() -> 0, () -> 0); // The number is just a placeholder
    public static final double RPS_TO_RAD_PER_SEC = Math.PI * 2;

    public static final double INTAKE_HEIGHT = 0; // The number is just a placeholder
    public static final double ARM_LENGTH = 0; // The number is just a placeholder

    public static final double ARM_MASS_TO_AXIS_OFFSET = 0; // The number is just a placeholder
    public static final double MAX_SCORE_RAD = 0; // The number is just a placeholder
}
