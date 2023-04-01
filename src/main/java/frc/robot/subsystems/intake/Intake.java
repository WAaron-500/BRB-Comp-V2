package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{

    private final intakeIO intakeIO;
    private final Spark intakeMotor1;
    private final Talon intakeMotor2;

    public Intake(intakeIO intakeIO) {
        this.intakeIO = intakeIO;
        this.intakeMotor1 = intakeIO.getIntakeMotor1();
        this.intakeMotor2 = intakeIO.getIntakeMotor2();
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
