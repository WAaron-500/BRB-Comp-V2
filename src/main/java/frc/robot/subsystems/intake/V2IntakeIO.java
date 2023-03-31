package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class V2IntakeIO implements intakeIO {

    public Spark intakeMotors;

    public V2IntakeIO() {
        this.intakeMotors = new Spark(2);

        this.intakeMotors.setInverted(false);
    }

    @Override
    public Spark getIntakeMotor() {
        return intakeMotors;
    }

    @Override
    public void setIntake(double setSpeed){
        intakeMotors.set(setSpeed);
    }

    @Override
    public void stopIntake() {
        intakeMotors.stopMotor();
    }
    
}
