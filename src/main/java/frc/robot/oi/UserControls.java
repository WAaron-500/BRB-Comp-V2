package frc.robot.oi;

import edu.wpi.first.wpilibj2.command.button.Trigger;

public interface UserControls {
    public default double getLeftDriveX() {
        return 0.0;
    }

    public default double getLeftDriveY() {
        return 0.0;
    }

    public default double getRightDriveX() {
        return 0.0;
    }

    public default double getRightDriveY() {
        return 0.0;
    }

    public default double intakeIn() {
        return 0.0;
    }

    public default Trigger intakeOut() {
        return null;
    }

    public default Trigger dPadUp(){
        return null;
    }

    public default Trigger dPadDown(){
        return null;
    }
}
