/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.*;

import frc.robot.commandgroups.*;
import frc.robot.subsystems.*;
import static frc.robot.RobotMap.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
    Command teleopCommand;

    public static Drivebase kDrivebase = new Drivebase();
    public static BallIntake kBallIntake = new BallIntake();
    public static Turret kTurret = new Turret();
    public static WheelOfDoom kWheelOfDoom = new WheelOfDoom();
    public static GearIntake kGearIntake = new GearIntake();
    public static Climber kClimber = new Climber();

    public static OI oi;

    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {
        oi = new OI();

        leftSlave.follow(leftMaster);
        rightSlave.follow(rightMaster);
        flyWheelSlave.follow(flyWheel);
        climberSlave.follow(climber);
    }

    @Override
    public void autonomousInit() {
        RobotMap.rightMaster.resetEncoder();

        if (teleopCommand != null) {
            teleopCommand.cancel();
        }
        teleopCommand = new TeleopCommands();

        if (teleopCommand != null) {
            teleopCommand.start();
        }
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        if (teleopCommand != null) {
            teleopCommand.cancel();
        }
        teleopCommand = new TeleopCommands();

        if (teleopCommand != null) {
            teleopCommand.start();
        }
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }

}
