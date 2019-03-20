package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static frc.robot.RobotMap.*;

public class WheelOfDoom extends Subsystem {
    @Override
    protected void initDefaultCommand() {
    }

    public void set(double speed) {
        doom.set(speed);
    }
}