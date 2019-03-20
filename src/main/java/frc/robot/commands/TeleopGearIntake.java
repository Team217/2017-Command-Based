package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class TeleopGearIntake extends Command {
    public TeleopGearIntake() {
        requires(Robot.kGearIntake);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double speed = Num.deadband(Robot.oi.oper.getY(), 0.08);
        Robot.kGearIntake.setArm(speed);

        double intakeSpeed = 0;
        if (Robot.oi.rightTriggerOper.get()) {
            intakeSpeed = -0.4;
        }
        else if (Robot.oi.leftTriggerOper.get()) {
            intakeSpeed = 0.4;
        }

        Robot.kGearIntake.setIntake(intakeSpeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.kGearIntake.setArm(0);
        Robot.kGearIntake.setIntake(0);
    }

    @Override
    protected void interrupted() {
        Robot.kGearIntake.setArm(0);
        Robot.kGearIntake.setIntake(0);
    }
}
