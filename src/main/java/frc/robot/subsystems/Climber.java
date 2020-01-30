package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.RobotMap.*;

public class Climber extends SubsystemBase {
    @Override
    public void periodic() {
    }

    public void set(double speed) {
        climber.set(speed);
    }
}