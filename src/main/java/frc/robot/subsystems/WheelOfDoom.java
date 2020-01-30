package frc.robot.subsystems;

import static frc.robot.RobotMap.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WheelOfDoom extends SubsystemBase {
    @Override
    public void periodic() {
    }

    public void set(double speed) {
        doom.set(speed);
    }
}