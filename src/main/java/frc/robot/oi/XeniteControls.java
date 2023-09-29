package frc.robot.oi;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class XeniteControls implements UserControls {

    private final CommandXboxController xanderController;

    public XeniteControls(int xanderController) {
        this.xanderController = new CommandXboxController(xanderController);
    }

    @Override
    public double getLeftDriveX() {
        return xanderController.getLeftX();
    }

    @Override
    public double getLeftDriveY() {
        return xanderController.getLeftY();
    }

    @Override
    public double getRightDriveX() {
        return xanderController.getRightX();
    }

    @Override
    public double getRightDriveY() {
        return xanderController.getRightY();
    }

    @Override
    public double intakeIn() {
        return xanderController.getRightTriggerAxis();
    }

    @Override
    public Trigger intakeOut() {
        return xanderController.leftTrigger(0.4);
    }

    @Override
    public Trigger dPadUp(){
        return xanderController.pov(0);
    }

    @Override
    public Trigger dPadDown(){
        return xanderController.pov(180);
    }
}
