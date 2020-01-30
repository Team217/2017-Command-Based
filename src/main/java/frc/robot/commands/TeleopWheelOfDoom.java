package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;

public class TeleopWheelOfDoom extends CommandBase {
    public TeleopWheelOfDoom() {
        addRequirements(Robot.kWheelOfDoom);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        double speed = Robot.oi.circleOper.get() ? 0.4 : 0;
        Robot.kWheelOfDoom.set(speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kWheelOfDoom.set(0);
    }
}
