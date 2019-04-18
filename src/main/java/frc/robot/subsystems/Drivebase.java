package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import static frc.robot.RobotMap.*;

public class Drivebase extends Subsystem {
    public enum PTO {
        Omni,
        FrontOmni,
        BackOmni,
        Traction
    }

    @Override
    protected void initDefaultCommand() {
    }

    public void set(double speed, double turn) {
        double leftSpeed = -speed + turn;
        double rightSpeed = speed + turn;

        leftMaster.set(leftSpeed);
        rightMaster.set(rightSpeed);
    }

    public void set(double speed) {
        set(speed, 0);
    }

    public void setPTO(PTO pto) {
        switch (pto) {
        case FrontOmni:
            shiftFront();
            break;
        case BackOmni:
            shiftBack();
            break;
        case Traction:
            shiftNone();
            break;
        case Omni:
        default:
            shiftAll();
            break;
        }
    }

    protected void shiftAll() {
        frontPTO.set(true);
        backPTO.set(true);
    }

    protected void shiftNone() {
        frontPTO.set(false);
        backPTO.set(false);
    }

    protected void shiftFront() {
        frontPTO.set(true);
        backPTO.set(false);
    }

    protected void shiftBack() {
        frontPTO.set(false);
        backPTO.set(true);
    }
}