package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public interface intakeIO {

    public default void setIntake(double setSpeed){}
    public default void stopIntake(){}
    public default Spark getIntakeMotor1() {
        return null;
    }
    public default Talon getIntakeMotor2() {
        return null;
    }
    
}
