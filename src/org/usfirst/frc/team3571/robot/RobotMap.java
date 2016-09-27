package org.usfirst.frc.team3571.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	/**
	 * This is everything that is connected to the PWM ports on the RoboRIO
	 */
	public static class PWM {
		public static final int LeftFrontDriveMotor = 0;
		public static final int LeftRearDriveMotor = 1;
		public static final int RightFrontDriveMotor = 2;
		public static final int RightRearDriveMotor = 3;
		// 4-9 Free
	}

	/**
	 * This is everything that is connected to the Digital ports on the RoboRIO
	 */
	public static class Digital {
		// 0-9 Free
	}

	/**
	 * This is everything that is connected to the Relay ports on the RoboRIO
	 */
	public static class Relay {
		// 0-3 Free
	}

	/**
	 * This is everything that is connected to the Solenoid ports on the RoboRIO
	 */
	public static class Solenoid {
		// 0-7 Free
	}

	/**
	 * This is everything that is connected to the USB's on the driver station
	 */
	public static class DriverUSB {
		public static final int DriverController = 0;
		public static final int OperatorController = 1;
	}

}
