package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class TeleopTurret extends Command {
    public TeleopTurret() {
        requires(Robot.kTurret);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double speed = Num.deadband(Robot.oi.oper.getZ(), 0.08);
        Robot.kTurret.setTurret(speed);

        double lifterSpeed = 0;
        double kickerSpeed = 0;
        double flywheelSpeed = 0;
        double hoodSpeed = 0;

        if (Robot.oi.rightBumperOper.get()) {
            kickerSpeed = -0.5;
            flywheelSpeed = -0.75;
        }
        if (Robot.oi.circleOper.get()) {
            lifterSpeed = -0.5;
        }

        if (Robot.oi.squareOper.get()) {
            hoodSpeed = 1;
        }
        else if (Robot.oi.xOper.get()) {
            hoodSpeed = -1;
        }
        
        Robot.kTurret.setLifter(lifterSpeed);
        Robot.kTurret.setKicker(kickerSpeed);
        Robot.kTurret.setFlywheel(flywheelSpeed);
        Robot.kTurret.setHood(hoodSpeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kTurret.setTurret(0);
        Robot.kTurret.setLifter(0);
        Robot.kTurret.setKicker(0);
        Robot.kTurret.setFlywheel(0);
        Robot.kTurret.setHood(0);
    }

    @Override
    protected void interrupted() {
        Robot.kTurret.setTurret(0);
        Robot.kTurret.setLifter(0);
        Robot.kTurret.setKicker(0);
        Robot.kTurret.setFlywheel(0);
        Robot.kTurret.setHood(0);
    }
}
