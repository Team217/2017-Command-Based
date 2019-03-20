package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static frc.robot.RobotMap.*;

public class BallIntake extends Subsystem {
    public enum Flap {
        Up,
        Down
    }

    @Override
    protected void initDefaultCommand() {
    }

    public void set(double speed) {
        ballIntake.set(speed);
    }

    public void setFlap(Flap pos) {
        switch (pos) {
        case Up:
            ballSolenoid.set(true);
            break;
        case Down:
        default:
            ballSolenoid.set(false);
            break;
        }
    }
}