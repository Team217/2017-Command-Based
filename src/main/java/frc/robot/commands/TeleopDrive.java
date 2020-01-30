package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;
import frc.robot.subsystems.Drivebase.PTO;

public class TeleopDrive extends CommandBase {
    public TeleopDrive() {
        addRequirements(Robot.kDrivebase);
    }

    @Override
    public void initialize() {
        Robot.kDrivebase.setPTO(PTO.Omni);
    }

    @Override
    public void execute() {
        double speed = Num.deadband(Robot.oi.driver.getY(), 0.08);
        double turn = Num.deadband(-Robot.oi.driver.getZ(), 0.08);
        
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
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kDrivebase.set(0);
    }
}
