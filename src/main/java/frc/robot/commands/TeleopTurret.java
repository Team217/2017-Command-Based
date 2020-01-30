package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;

public class TeleopTurret extends CommandBase {
    public TeleopTurret() {
        addRequirements(Robot.kTurret);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        double speed = Num.deadband(Robot.oi.oper.getZ(), 0.08);
        Robot.kTurret.setTurret(speed);

        double lifterSpeed = 0;
        double kickerSpeed = 0;
        double flywheelSpeed = 0;
        double hoodSpeed = 0;

        if (Robot.oi.rightBumperOper.get()) {
            kickerSpeed = 0.5;
            flywheelSpeed = -0.75;
        }
        if (Robot.oi.circleOper.get()) {
            lifterSpeed = 0.5;
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
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kTurret.setTurret(0);
        Robot.kTurret.setLifter(0);
        Robot.kTurret.setKicker(0);
        Robot.kTurret.setFlywheel(0);
        Robot.kTurret.setHood(0);
    }
}
