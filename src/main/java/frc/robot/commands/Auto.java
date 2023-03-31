package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.intakeCommands.IntakeIn;
import frc.robot.subsystems.drivetrain.DriveBase;
import frc.robot.subsystems.intake.Intake;

public class Auto extends ParallelCommandGroup {

    public Auto(DriveBase drive, Intake intake) {
        addCommands(new DriveStraight(drive, 1).withTimeout(1));
        addCommands(new IntakeIn(intake));
    }

}