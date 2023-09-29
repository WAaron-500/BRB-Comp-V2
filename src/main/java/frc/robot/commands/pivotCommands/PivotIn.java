package frc.robot.commands.pivotCommands;

import java.util.function.Supplier;

import javax.print.attribute.SupportedValuesAttribute;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;
import frc.robot.subsystems.pivot.Pivot;

public class PivotIn extends CommandBase{
    
    private final Pivot pivot;
    private final Supplier<Double> speed;

    public PivotIn(Pivot pivot, Supplier<Double> speed) {
        addRequirements(pivot);

        this.speed = speed;
        this.pivot = pivot;

        // Set defaults of tunable numbers here
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    @SuppressWarnings("unused")
    public void execute() {
        double intakeSpeed = speed.get();
        pivot.PivotIn(intakeSpeed);
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
