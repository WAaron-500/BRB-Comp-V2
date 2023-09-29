package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class V2IntakeIO implements intakeIO {

    public TalonSRX intakeMotor;

    public V2IntakeIO() {
        this.intakeMotor = new TalonSRX(14);
    }

    @Override
    public TalonSRX getIntakeMotor() {
        return intakeMotor;
    }

    @Override
    public void setIntake(double setSpeed){
        intakeMotor.set(TalonSRXControlMode.PercentOutput ,setSpeed);
        System.out.println("your mother");
    }

    @Override
    public void stopIntake() {
        intakeMotor.set(TalonSRXControlMode.PercentOutput, 0);
    }
}
