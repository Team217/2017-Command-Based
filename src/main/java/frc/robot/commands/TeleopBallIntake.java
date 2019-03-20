package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;
import frc.robot.subsystems.BallIntake.Flap;

public class TeleopBallIntake extends Command {
    public TeleopBallIntake() {
        requires(Robot.kBallIntake);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double speed = Robot.oi.triangleOper.get() ? 0.8 : 0;
        Robot.kBallIntake.set(speed);

        if (Robot.oi.oper.getPOV() == 0) {
            Robot.kBallIntake.setFlap(Flap.Up);
        }
        else if (Robot.oi.oper.getPOV() == 180) {
            Robot.kBallIntake.setFlap(Flap.Down);
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kBallIntake.set(0);
        Robot.kBallIntake.setFlap(Flap.Down);
    }

    @Override
    protected void interrupted() {
        Robot.kBallIntake.set(0);
        Robot.kBallIntake.setFlap(Flap.Down);
    }
}
