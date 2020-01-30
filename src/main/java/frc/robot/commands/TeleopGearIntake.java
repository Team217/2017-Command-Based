package frc.robot.commands;

import org.team217.*;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.*;

public class TeleopGearIntake extends CommandBase {
    public TeleopGearIntake() {
        addRequirements(Robot.kGearIntake);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
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
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.kGearIntake.setArm(0);
        Robot.kGearIntake.setIntake(0);
    }
}
