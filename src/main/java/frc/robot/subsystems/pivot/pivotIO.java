package frc.robot.subsystems.pivot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public interface pivotIO {

    public default void setIntake(double setSpeed){}
    public default void stopIntake(){}
    public default WPI_TalonSRX getIntakeMotor() {
        return null;
    }
}
