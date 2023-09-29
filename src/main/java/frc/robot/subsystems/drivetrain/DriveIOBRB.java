package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class DriveIOBRB implements DriveIO {

    public WPI_TalonSRX leftLeader;
    public WPI_TalonSRX rightLeader;
    public WPI_TalonSRX leftSlave;
    public WPI_TalonSRX rightSlave;


    // public WPI_TalonSRX leftLeader;
    // public WPI_TalonSRX rightLeader;
    // public WPI_TalonSRX leftFollower1;
    // public WPI_TalonSRX rightFollower1;
    // public WPI_TalonSRX leftFollower2;
    // public WPI_TalonSRX rightFollower2;

    public DriveIOBRB() {
        this.leftLeader = new WPI_TalonSRX(1);
        this.leftSlave = new WPI_TalonSRX(3);
        this.rightLeader = new WPI_TalonSRX(2);
        this.rightSlave = new WPI_TalonSRX(4);

        rightSlave.follow(rightLeader);
        leftSlave.follow(leftLeader);

        leftLeader.setInverted(false);
        rightLeader.setInverted(true);
    }

    @Override
    public WPI_TalonSRX getLeftLeader() {
        return leftLeader;
    }

    @Override
    public WPI_TalonSRX getRightLeader() {
        return rightLeader;
    }

    @Override
    public void setSpeed(double leftSpeed, double rightSpeed) {
        // controlmode.setSpeed
        leftLeader.set(TalonSRXControlMode.PercentOutput, leftSpeed);
        rightLeader.set(TalonSRXControlMode.PercentOutput,rightSpeed);
    }

    @Override
    public void setBrakeMode(boolean enable) {
        NeutralMode mode = enable ? NeutralMode.Brake : NeutralMode.Coast;

    }
}
