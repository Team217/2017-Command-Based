package frc.robot.commandgroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class TeleopCommands extends CommandGroup {
    public TeleopCommands() {
        addParallel(new TeleopDrive());
        addParallel(new TeleopBallIntake());
        addParallel(new TeleopTurret());
        addParallel(new TeleopWheelOfDoom());
        addParallel(new TeleopGearIntake());
        addParallel(new TeleopClimber());
    }
}