/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import org.team217.ctre.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Controllers
    public static final int driverPort = 0;
    public static final int operPort = 1;

    // Buttons
    public static final int rightMaster_ID = 15;
    public static final int rightSlave_ID = 14;
    public static final int leftMaster_ID = 0;
    public static final int leftSlave_ID = 1;

    public static final int frontPTO_ID = 2;
    public static final int backPTO_ID = 1;
    public static final int ballSolenoid_ID = 4;

    public static final int doom_ID = 12;
    public static final int gearIntake_ID = 7;
    public static final int gearArm_ID = 8;
    public static final int ballIntake_ID = 13;
    public static final int kicker_ID = 5;
    public static final int lifter_ID = 4;
    public static final int flyWheel_ID = 11;
    public static final int flyWheelSlave_ID = 10;
    public static final int turret_ID = 6;
    public static final int hood_ID = 9;

    public static final int climber_ID = 2;
    public static final int climberSlave_ID = 3;

    // Drive
    public static WPI_TalonSRX rightMaster = new WPI_TalonSRX(rightMaster_ID);
    public static WPI_TalonSRX rightSlave = new WPI_TalonSRX(rightSlave_ID);
    public static WPI_TalonSRX leftMaster = new WPI_TalonSRX(leftMaster_ID);
    public static WPI_TalonSRX leftSlave = new WPI_TalonSRX(leftSlave_ID);

    // Pneumatics
    public static Solenoid frontPTO = new Solenoid(frontPTO_ID);
    public static Solenoid backPTO = new Solenoid(backPTO_ID);
    public static Solenoid ballSolenoid = new Solenoid(ballSolenoid_ID);

    // Components
    public static WPI_TalonSRX doom = new WPI_TalonSRX(doom_ID);
    public static WPI_TalonSRX gearIntake = new WPI_TalonSRX(gearIntake_ID);
    public static WPI_TalonSRX gearArm = new WPI_TalonSRX(gearArm_ID);
    public static WPI_TalonSRX ballIntake = new WPI_TalonSRX(ballIntake_ID);
    public static WPI_TalonSRX kicker = new WPI_TalonSRX(kicker_ID);
    public static WPI_TalonSRX lifter = new WPI_TalonSRX(lifter_ID);
    public static WPI_TalonSRX flyWheel = new WPI_TalonSRX(flyWheel_ID);
    public static WPI_TalonSRX flyWheelSlave = new WPI_TalonSRX(flyWheelSlave_ID);
    public static WPI_TalonSRX turret = new WPI_TalonSRX(turret_ID);
    public static WPI_TalonSRX hood = new WPI_TalonSRX(hood_ID);

    // Climber
    public static WPI_TalonSRX climber = new WPI_TalonSRX(climber_ID);
    public static WPI_TalonSRX climberSlave = new WPI_TalonSRX(climberSlave_ID);

    // Buttons
    public static final int buttonSquare = 1;
    public static final int buttonX = 2;
    public static final int buttonCircle = 3;
    public static final int buttonTriangle = 4;
    public static final int leftBumper = 5;
    public static final int rightBumper = 6;
    public static final int leftTrigger = 7;
    public static final int rightTrigger = 8;
    public static final int buttonOption = 10;
    public static final int leftAnalog = 11;
    public static final int rightAnalog = 12;
    public static final int touchPad = 14;

    // Axes
    public static final int X_Axis = 0;
    public static final int Y_Axis = 1;
    public static final int Z_Axis = 2;
    public static final int Z_RotateAxis = 5;
}
