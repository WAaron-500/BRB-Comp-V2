package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public interface intakeIO {

    public default void setIntake(double setSpeed){}
    public default void stopIntake(){}
    public default WPI_TalonSRX getIntakeMotor() {
        return null;
    }
    
}
