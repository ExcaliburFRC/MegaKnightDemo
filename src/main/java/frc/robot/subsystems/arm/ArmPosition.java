package frc.robot.subsystems.arm;

public enum ArmPosition { 
    PRE_CORAL_SCORE(0, true), // The number is just a placeholder

    TILTED_BRANCH_CORAL_SCORE(0, true), // The number is just a placeholder
    TILTED_BRANCH_CORAL_SCORE_POST(0, true), // The number is just a placeholder

    L4(0, true), // The number is just a placeholder
    L4_POST(0, true), // The number is just a placeholder

    INTAKE_ALGAE(0, false), // The number is just a placeholder

    NET(0, false), // The number is just a placeholder
    CLIMB(0, false), // The number is just a placeholder

    DOWNWARDS(1.5 * Math.PI, false),

    UPWARDS(Math.PI / 2, false),

    PROCESSOR(0, false); // The number is just a placeholder

    private final double angle;
    public final boolean mirrorable;

    ArmPosition(double angle, boolean mirrorable) {
        this.mirrorable = mirrorable;
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }
}
