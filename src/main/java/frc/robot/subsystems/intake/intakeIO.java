package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public interface intakeIO {

    public default void setIntake(double setSpeed){}
    public default void stopIntake(){}
    public default TalonSRX getIntakeMotor() {
        return null;
    }
    
}
