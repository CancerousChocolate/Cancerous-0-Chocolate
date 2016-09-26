package org.usfirst.frc.team3571.robot;

import org.usfirst.frc.team3571.robot.utilities.*;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI extends RobotMap {
	private static final double ControllerDeadzone = 0.25;

	public static final XboxController driver = new XboxController(DriverUSB.DriverController, ControllerDeadzone);
	public static final XboxController operator = new XboxController(DriverUSB.OperatorController, ControllerDeadzone);

	public static final RobotDrive drive = new RobotDrive(PWM.LeftFrontDriveMotor, PWM.LeftRearDriveMotor,
			PWM.RightFrontDriveMotor, PWM.RightRearDriveMotor);

	/**
	 * Calls All Refresh Methods
	 */
	public static void refreshAll() {
		driver.refresh();
		operator.refresh();
	}
}
