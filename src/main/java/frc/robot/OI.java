/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;

public class OI {
    // Joysticks
    public Joystick driver = new Joystick(RobotMap.driverPort);
    public Joystick oper = new Joystick(RobotMap.operPort);

    // Buttons
    public Button squareOper = new JoystickButton(oper, RobotMap.buttonSquare);
    public Button circleOper = new JoystickButton(oper, RobotMap.buttonCircle);
    public Button triangleOper = new JoystickButton(oper, RobotMap.buttonTriangle);
    public Button xOper = new JoystickButton(oper, RobotMap.buttonX);
    public Button leftBumperOper = new JoystickButton(oper, RobotMap.leftBumper);
    public Button rightBumperOper = new JoystickButton(oper, RobotMap.rightBumper);
    public Button leftTriggerOper = new JoystickButton(oper, RobotMap.leftTrigger);
    public Button rightTriggerOper = new JoystickButton(oper, RobotMap.rightTrigger);
    public Button leftAnalogOper = new JoystickButton(oper, RobotMap.leftAnalog);

    // Driver Buttons
    public Button leftBumperDriver = new JoystickButton(driver, RobotMap.leftBumper);
    public Button circleDriver = new JoystickButton(driver, RobotMap.buttonCircle);
    public Button triangleDriver = new JoystickButton(driver, RobotMap.buttonTriangle);
    public Button squareDriver = new JoystickButton(driver, RobotMap.buttonSquare);
    public Button rightBumperDriver = new JoystickButton(driver, RobotMap.rightBumper);
    public Button rightTriggerDriver = new JoystickButton(driver, RobotMap.rightTrigger);
    public Button leftAnalogDriver = new JoystickButton(driver, RobotMap.leftAnalog);
    public Button leftTriggerDriver = new JoystickButton(driver, RobotMap.leftTrigger);
    public Button rightAnalogDriver = new JoystickButton(driver, RobotMap.rightAnalog);
    public Button touchPadDriver = new JoystickButton(driver, RobotMap.touchPad);
}
