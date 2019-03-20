package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static frc.robot.RobotMap.*;

public class Climber extends Subsystem {
    @Override
    protected void initDefaultCommand() {
    }

    public void set(double speed) {
        climber.set(speed);
    }
}