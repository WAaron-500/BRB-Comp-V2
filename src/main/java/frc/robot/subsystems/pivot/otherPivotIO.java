package frc.robot.subsystems.pivot;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class otherPivotIO implements pivotIO {

    public WPI_TalonSRX pivotMotor;

    public otherPivotIO() {
        this.pivotMotor = new WPI_TalonSRX(60);
    }

    @Override
    public WPI_TalonSRX getPivotMotor() {
        return pivotMotor;
    }

    @Override
    public void setPivot(double setSpeed){
        pivotMotor.set(TalonSRXControlMode.PercentOutput ,setSpeed);
    }

    @Override
    public void stopPivot() {
        pivotMotor.set(TalonSRXControlMode.PercentOutput, 0);
    }
}