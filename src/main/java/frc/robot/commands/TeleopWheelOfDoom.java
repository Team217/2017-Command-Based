package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class TeleopWheelOfDoom extends Command {
    public TeleopWheelOfDoom() {
        requires(Robot.kWheelOfDoom);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double speed = Robot.oi.circleOper.get() ? -0.4 : 0;
        Robot.kWheelOfDoom.set(speed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kWheelOfDoom.set(0);
    }

    @Override
    protected void interrupted() {
        Robot.kWheelOfDoom.set(0);
    }
}
