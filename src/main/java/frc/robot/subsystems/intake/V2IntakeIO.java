package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class V2IntakeIO implements intakeIO {

    public Spark intakeMotor1;
    public Talon intakeMotor2;

    public V2IntakeIO() {
        this.intakeMotor1 = new Spark(2);
        this.intakeMotor2 = new Talon(3);

        this.intakeMotor1.setInverted(true);
        this.intakeMotor2.setInverted(true);
    }

    @Override
    public Spark getIntakeMotor1() {
        return intakeMotor1;
    }
    @Override
    public Talon getIntakeMotor2() {
        return intakeMotor2;
    }

    @Override
    public void setIntake(double setSpeed){
        intakeMotor1.set(setSpeed);
        intakeMotor2.set(setSpeed);
        System.out.println("your mother");
    }

    @Override
    public void stopIntake() {
        intakeMotor1.stopMotor();
        intakeMotor2.stopMotor();
    }
    
}
