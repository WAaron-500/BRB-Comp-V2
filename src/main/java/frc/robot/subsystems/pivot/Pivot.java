package frc.robot.subsystems.pivot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase{

    private final pivotIO pivotIO;
    private final WPI_TalonSRX pivotMotor;

    public Pivot(pivotIO pivotIO) {
        this.pivotIO = pivotIO;
        this.pivotMotor = pivotIO.getPivot();
    }

    public void PivotIn(double speed) {
        pivotIO.setPivot(speed);
    }

    public void pivotOut(double speed) {
        pivotIO.setPivot(-speed);
    }

    public void pivotStop() {
        pivotIO.stopPivot();
    }
}
