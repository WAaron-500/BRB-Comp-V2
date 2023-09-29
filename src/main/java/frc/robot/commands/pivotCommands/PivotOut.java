package frc.robot.commands.pivotCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.pivot.Pivot;

public class PivotOut extends CommandBase{
    
    private final Pivot pivot;

    public PivotOut(Pivot pivot) {
        addRequirements(pivot);

        this.pivot = pivot;

        // Set defaults of tunable numbers here
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    @SuppressWarnings("unused")
    public void execute() {
        pivot.PivotIn(-1);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        pivot.pivotStop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

}
