package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.RobotMap.*;

public class GearIntake extends SubsystemBase {
    @Override
    public void periodic() {
    }

    public void setIntake(double speed) {
        gearIntake.set(speed);
    }

    public void setArm(double speed) {
        double mult = 0.5;
        gearArm.set(mult * speed);
    }
}