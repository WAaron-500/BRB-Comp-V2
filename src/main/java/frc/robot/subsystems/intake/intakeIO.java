package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public interface intakeIO {

    public default void setIntake(double setSpeed){}
    public default void stopIntake(){}
    public default Spark getIntakeMotor() {
        return null;
    }
    
}
