package frc.robot.subsystems.pivot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public interface pivotIO {

    public default void setPivot(double setSpeed){}
    public default void stopPivot(){}
    public default WPI_TalonSRX getPivotMotor() {
        return null;
    }
    
}