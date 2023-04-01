package frc.robot.commands.intakeCommands;

import java.util.function.Supplier;

import javax.print.attribute.SupportedValuesAttribute;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class IntakeIn extends CommandBase{
    
    private final Intake intake;
    private final Supplier<Double> speed;

    public IntakeIn(Intake intake, Supplier<Double> speed) {
        addRequirements(intake);

        this.speed = speed;
        this.intake = intake;

        // Set defaults of tunable numbers here
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    @SuppressWarnings("unused")
    public void execute() {
        double intakeSpeed = speed.get();
        intake.IntakeIn(intakeSpeed);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        intake.intakeStop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

}
