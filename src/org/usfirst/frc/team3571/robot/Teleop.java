package org.usfirst.frc.team3571.robot;

import org.usfirst.frc.team3571.robot.utilities.XboxController.Axis;
import org.usfirst.frc.team3571.robot.utilities.XboxController.Button;
import org.usfirst.frc.team3571.robot.utilities.XboxController.Sides;

public class Teleop extends OI {
	// Only a reference is being passed therefore the button keeps on
	// functioning
	static Button driveStopButton = driver.Buttons.B;

	static boolean triggerDrive = false;
	static Button triggerSwitchButton = driver.Buttons.LeftStick;

	static double driveY = 0;

	public static void Init() {
		// TODO Make Teleop Init
	}

	public static void Periodic() {
		// TODO Make Teleop Code

		if (triggerSwitchButton.changedDown) {
			triggerDrive = !triggerDrive;
		}

		if (triggerDrive) {
			driveY = driver.Triggers.Combined;
		} else {
			driveY = driver.LeftStick.Y;
		}
		// The Above is the same as
		// driveY = triggerDrive ? driver.Triggers.Combined : driver.LeftStick.Y;

		if (!driveStopButton.current) {
			drive.arcadeDrive(driveY, driver.LeftStick.X);
		} else {
			drive.stopMotor();
		}
	}
}
