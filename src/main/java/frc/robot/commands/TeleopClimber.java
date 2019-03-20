package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class TeleopClimber extends Command {
    public TeleopClimber() {
        requires(Robot.kClimber);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double speed = Robot.oi.leftBumperOper.get() ? 0.8 : 0;
        Robot.kClimber.set(speed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kClimber.set(0);
    }

    @Override
    protected void interrupted() {
        Robot.kClimber.set(0);
    }
}
