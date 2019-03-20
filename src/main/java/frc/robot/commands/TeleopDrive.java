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

        //if (Robot.oi.rightTriggerDriver.get()) {
        if (Robot.oi.driver.getRawAxis(3) > 0) {
            Robot.kDrivebase.setPTO(PTO.Omni);
        }
        //else if (Robot.oi.rightBumperDriver.get()) {
        else if (Robot.oi.driver.getRawButton(6)) {
            Robot.kDrivebase.setPTO(PTO.Traction);
        }
        //else if (Robot.oi.leftTriggerDriver.get()) {
        else if (Robot.oi.driver.getRawAxis(2) > 0) {
            Robot.kDrivebase.setPTO(PTO.FrontOmni);
        }
        //else if (Robot.oi.leftBumperDriver.get()) {
        else if (Robot.oi.driver.getRawButton(5)) {
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
