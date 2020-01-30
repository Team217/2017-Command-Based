package frc.robot.commandgroups;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.*;

public class TeleopCommands extends SequentialCommandGroup {
    public TeleopCommands() {
        addCommands(
            parallel(
                new TeleopDrive(),
                new TeleopBallIntake(),
                new TeleopTurret(),
                new TeleopWheelOfDoom(),
                new TeleopGearIntake(),
                new TeleopClimber()
            )
        );
    }
}