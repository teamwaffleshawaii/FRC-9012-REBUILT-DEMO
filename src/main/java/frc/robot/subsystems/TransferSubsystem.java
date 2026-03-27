package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.*;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class TransferSubsystem extends SubsystemBase {

    // ==============================
    // Motor Controllers
    // ==============================
    private final SparkMax transferMotor = new SparkMax(18, MotorType.kBrushless);
    private final SparkMax mechanumMotor = new SparkMax(17, MotorType.kBrushless);

    // ==============================
    // Transfer Control
    // ==============================
    public void runTransfer(double speed) {
        transferMotor.set(speed);
    }
    
    public void runMecanum(double speed) {
        mechanumMotor.set(speed);
    }

    public void transferIn() {
        runTransfer(-1);
        runMecanum(-1);
    }

    public void transferOut() {
        runTransfer(0.35);
        runMecanum(0.35);
    }

    public void transferStop() {
        runTransfer(0.0);
        runMecanum(0.0);
    }
}