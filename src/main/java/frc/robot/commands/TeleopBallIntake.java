package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;
import frc.robot.subsystems.BallIntake.Flap;

public class TeleopBallIntake extends CommandBase {
    public TeleopBallIntake() {
        addRequirements(Robot.kBallIntake);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        double speed = Robot.oi.triangleOper.get() ? 0.8 : 0;
        Robot.kBallIntake.set(speed);

        if (Robot.oi.oper.getPOV() == 0 && Robot.oi.oper.getButtonCount() != 0) {
            Robot.kBallIntake.setFlap(Flap.Up);
        }
        else if (Robot.oi.oper.getPOV() == 180) {
            Robot.kBallIntake.setFlap(Flap.Down);
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kBallIntake.set(0);
        Robot.kBallIntake.setFlap(Flap.Down);
    }
}
