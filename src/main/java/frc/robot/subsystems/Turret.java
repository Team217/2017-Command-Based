package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.RobotMap.*;

public class Turret extends SubsystemBase {
    @Override
    public void periodic() {
    }

    public void setKicker(double speed) {
        kicker.set(speed);
    }

    public void setLifter(double speed) {
        lifter.set(speed);
    }

    public void setFlywheel(double speed) {
        flyWheel.set(speed);
    }

    public void setTurret(double speed) {
        turret.set(0.75 * -speed);
    }

    public void setHood(double speed) {
        hood.set(0.3 * speed);
    }
}