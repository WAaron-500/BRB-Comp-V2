package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{

    private final intakeIO intakeIO;
    private final WPI_TalonSRX intakeMotor;

    public Intake(intakeIO intakeIO) {
        this.intakeIO = intakeIO;
        this.intakeMotor = intakeIO.getIntakeMotor();
    }

    public void IntakeIn(double speed) {
        intakeIO.setIntake(speed);
    }

    public void intakeOut(double speed) {
        intakeIO.setIntake(-speed);
    }

    public void intakeStop() {
        intakeIO.stopIntake();
    }
}
