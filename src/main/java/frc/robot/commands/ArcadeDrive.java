package frc.robot.commands;

import java.util.function.Supplier;

// import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain.DriveBase;

/** An example command that uses an example subsystem. */
public class ArcadeDrive extends CommandBase {
    private final DriveBase drive;
    private final Supplier<Double> leftXSupplier, leftYSupplier,
            rightXSupplier, rightYSupplier;

    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public ArcadeDrive(DriveBase drive,
            Supplier<Double> leftXSupplier, Supplier<Double> leftYSupplier,
            Supplier<Double> rightXSupplier, Supplier<Double> rightYSupplier) {
        addRequirements(drive);
        this.drive = drive;
        this.leftXSupplier = leftXSupplier;
        this.leftYSupplier = leftYSupplier;
        this.rightXSupplier = rightXSupplier;
        this.rightYSupplier = rightYSupplier;

        // Set defaults of tunable numbers here
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        leftXSupplier.get();
        leftYSupplier.get();
        rightXSupplier.get();
        rightYSupplier.get();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    @SuppressWarnings("unused")
    public void execute() {
        double leftXValue = leftXSupplier.get();
        double leftYValue = leftYSupplier.get();
        double rightXValue = rightXSupplier.get();
        double rightYValue = rightYSupplier.get();
        double mult = 1;
        double forwardSpeed;
        double turnSpeed;
        forwardSpeed = -Math.pow(leftYValue, 2) * Math.copySign(mult, leftYValue);
        turnSpeed = Math.pow(rightXValue, 4) * Math.copySign(mult, rightXValue);

        drive.driveBase.curvatureDrive(forwardSpeed, turnSpeed, true);
        // drive.driveBase.arcadeDrive(-leftSpeed, rightSpeed);

    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
