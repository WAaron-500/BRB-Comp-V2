package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBase extends SubsystemBase {

    private final DriveIO driveIO;
    private final MotorControllerGroup left;
    private final MotorControllerGroup right;

    public DifferentialDrive driveBase;

    public DriveBase(DriveIO driveIO) {
        this.driveIO = driveIO;

        this.left = driveIO.getLeftLeader();
        this.right = driveIO.getRightLeader();

        this.driveBase = new DifferentialDrive(left, right);

    }

    @Override
    public void periodic() {
    }

    public void driveSpeed(double leftSpeed, double rightSpeed) {
        driveIO.setSpeed(leftSpeed, rightSpeed);
    }

    public void stop() {
        driveIO.setSpeed(0, 0);
    }

    public DifferentialDriveWheelSpeeds getWheelSpeeds() {
        return new DifferentialDriveWheelSpeeds();
    }
}
