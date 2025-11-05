package frc.robot.subsystems.gripper;

public enum GripperStates {
    INTAKE_ALGAE(0), // The number is just a placeholder
    INTAKE_CORAL(0), // The number is just a placeholder
    ALGAE(0), // The number is just a placeholder
    CORAL(0), // The number is just a placeholder
    HANDOFF(0), // The number is just a placeholder
    RELEASE_CORAL(0), // The number is just a placeholder
    RELEASE_ALGAE(0), // The number is just a placeholder
    VACENT(0); // The number is just a placeholder

    final double output;

    GripperStates(double output){
        this.output = output;
    }
}
