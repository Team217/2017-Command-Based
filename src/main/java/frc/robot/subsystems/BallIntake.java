package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.RobotMap.*;

public class BallIntake extends SubsystemBase {
    public enum Flap {
        Up,
        Down
    }

    @Override
    public void periodic() {
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