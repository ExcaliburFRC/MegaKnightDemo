package frc.robot.subsystems.elevator;

public enum ElevatorStates {
    L2(0), // The number is just a placeholder
    L2_POST(0), // The number is just a placeholder

    L3(0), // The number is just a placeholder
    L3_POST(0), // The number is just a placeholder

    PRE_L4(0), // The number is just a placeholder
    L4(0), // The number is just a placeholder
    L4_POST(0), // The number is just a placeholder

    ALGAE2(0), // The number is just a placeholder
    ALGAE3(0), // The number is just a placeholder

    HANDOFF(0), // The number is just a placeholder

    NET(0), // The number is just a placeholder
    PROCESSOR(0), // The number is just a placeholder

    DEFAULT_WITH_CORAL(0), // The number is just a placeholder
    DEFAULT_WITH_ALGAE(0), // The number is just a placeholder
    DEFAULT_WITHOUT_GAMEPICE(0), // The number is just a placeholder

    L1_HEIGHT(0), // The number is just a placeholder

    CLIMB(0); // The number is just a placeholder

    private final double height;

    ElevatorStates(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}