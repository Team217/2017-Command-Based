package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static frc.robot.RobotMap.*;

public class GearIntake extends Subsystem {
    @Override
    protected void initDefaultCommand() {
    }

    public void setIntake(double speed) {
        gearIntake.set(speed);
    }

    public void setArm(double speed) {
        double mult = 0.5;
        gearArm.set(mult * speed);
    }
}