package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.intakeCommands.IntakeIn;
import frc.robot.commands.intakeCommands.IntakeOut;
import frc.robot.subsystems.drivetrain.DriveBase;
import frc.robot.subsystems.intake.Intake;

public class Auto extends ParallelCommandGroup {

    public Auto(DriveBase drive, Intake intake) {
        new SequentialCommandGroup(
            new DriveStraight(drive, 1).withTimeout(1),
            // TODO: ADD TURN COMMAND 
            new DriveStraight(drive, 1).withTimeout(1)
        ); 
        addCommands(new IntakeIn(intake, () ->1.0).withTimeout(2).andThen(new IntakeOut(intake)));
    }

}