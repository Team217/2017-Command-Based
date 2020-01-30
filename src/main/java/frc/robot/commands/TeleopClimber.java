package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;

public class TeleopClimber extends CommandBase {
    public TeleopClimber() {
        addRequirements(Robot.kClimber);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        double speed = Robot.oi.leftBumperOper.get() ? 0.8 : 0;
        Robot.kClimber.set(speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kClimber.set(0);
    }
}
