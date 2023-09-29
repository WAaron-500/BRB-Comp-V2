package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class V2IntakeIO implements intakeIO {

    public WPI_TalonSRX intakeMotor;

    public V2IntakeIO() {
        this.intakeMotor = new WPI_TalonSRX(14);
    }

    @Override
    public WPI_TalonSRX getIntakeMotor() {
        return intakeMotor;
    }

    @Override
    public void setIntake(double setSpeed){
        intakeMotor.set(setSpeed);
    }

    @Override
    public void stopIntake() {
        intakeMotor.set(0);
    }
}
