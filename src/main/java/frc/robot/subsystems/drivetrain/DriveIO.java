package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public interface DriveIO {

    public default MotorControllerGroup getLeftLeader() {
        return null;
    }

    public default MotorControllerGroup getRightLeader() {
        return null;
    }

    /** Sets the velocity of the drivetrain motors (closed loop) */
    public default void setVelocity(double leftSpeed,
            double rightSpeed) {
    }

    public default void setSpeed(double leftSpeed, double rightSpeed) {

    }

    public default void setBrakeMode(boolean enabled) {

    }
}
