package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class DriveIOBRB implements DriveIO {

    public Spark leftLeader;
    public Spark rightLeader;


    // public WPI_TalonSRX leftLeader;
    // public WPI_TalonSRX rightLeader;
    // public WPI_TalonSRX leftFollower1;
    // public WPI_TalonSRX rightFollower1;
    // public WPI_TalonSRX leftFollower2;
    // public WPI_TalonSRX rightFollower2;

    public DriveIOBRB() {
        this.leftLeader = new Spark(0);
        this.rightLeader = new Spark(1);

        leftLeader.setInverted(false);
        rightLeader.setInverted(true);
    }

    @Override
    public Spark getLeftLeader() {
        return leftLeader;
    }

    @Override
    public Spark getRightLeader() {
        return rightLeader;
    }

    @Override
    public void setSpeed(double leftSpeed, double rightSpeed) {
        // controlmode.setSpeed
        leftLeader.set(leftSpeed);
        rightLeader.set(rightSpeed);
    }

    @Override
    public void setBrakeMode(boolean enable) {
        NeutralMode mode = enable ? NeutralMode.Brake : NeutralMode.Coast;

    }
}
