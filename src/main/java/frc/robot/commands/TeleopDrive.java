package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;
import frc.robot.subsystems.Drivebase.PTO;

public class TeleopDrive extends Command {
    public TeleopDrive() {
        requires(Robot.kDrivebase);
    }

    @Override
    protected void initialize() {
        Robot.kDrivebase.setPTO(PTO.Omni);
    }

    @Override
    protected void execute() {
        double speed = Num.deadband(Robot.oi.driver.getY(), 0.08);
        double turn = Num.deadband(-Robot.oi.driver.getRawAxis(4), 0.08);

        Robot.kDrivebase.set(speed, turn);

        if (Robot.oi.rightTriggerDriver.get()) {
            Robot.kDrivebase.setPTO(PTO.Omni);
        }
        else if (Robot.oi.rightBumperDriver.get()) {
            Robot.kDrivebase.setPTO(PTO.Traction);
        }
        else if (Robot.oi.leftTriggerDriver.get()) {
            Robot.kDrivebase.setPTO(PTO.FrontOmni);
        }
        else if (Robot.oi.leftBumperDriver.get()) {
            Robot.kDrivebase.setPTO(PTO.BackOmni);
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kDrivebase.set(0);
    }

    @Override
    protected void interrupted() {
        Robot.kDrivebase.set(0);
    }
}
