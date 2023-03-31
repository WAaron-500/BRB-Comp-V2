// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.Auto;
import frc.robot.commands.intakeCommands.IntakeIn;
import frc.robot.commands.intakeCommands.IntakeOut;
import frc.robot.oi.UserControls;
import frc.robot.oi.XeniteControls;
import frc.robot.subsystems.drivetrain.DriveBase;
import frc.robot.subsystems.drivetrain.DriveIO;
import frc.robot.subsystems.drivetrain.DriveIOBRB;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.intake.V2IntakeIO;
import frc.robot.subsystems.intake.intakeIO;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private DriveBase driveBase;
    private Intake intake;

    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {
        // Configure the button bindings
        configureSubsystems();
        configureButtonBindings();
    }

    private void configureSubsystems() {
        this.driveBase = new DriveBase(new DriveIOBRB());
        this.intake = new Intake(new V2IntakeIO());

        //fail safes because they are pretty
        driveBase = driveBase != null ? driveBase : new DriveBase(new DriveIO() {
        });
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        // UserControls controls = new XeniteControls(0);
        UserControls controls = new XeniteControls(0);

        //defining commands
        ArcadeDrive defaultDriveCommand = new ArcadeDrive(driveBase,
                () -> controls.getLeftDriveX(),
                () -> controls.getLeftDriveY(),
                () -> controls.getRightDriveX(),
                () -> controls.getRightDriveY());

        //controller commands
        IntakeIn intakeInCommand = new IntakeIn(intake);
        IntakeOut intakeOutCommand = new IntakeOut(intake);

        //bounding commands
        controls.intakeIn().onTrue(intakeInCommand);
        controls.intakeOut().onTrue(intakeOutCommand);

        //default commands
        driveBase.setDefaultCommand(defaultDriveCommand);
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return new Auto(driveBase, intake);
    }
}
