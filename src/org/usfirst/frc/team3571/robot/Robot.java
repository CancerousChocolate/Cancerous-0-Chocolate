
package org.usfirst.frc.team3571.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.*;
import org.usfirst.frc.team3571.robot.Command.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	SendableChooser chooser;
	Command auto;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		chooser = new SendableChooser();
		chooser.addDefault("Default Auto", new DefaultAuto());
		chooser.addObject("My Auto", new MyAuto());
		SmartDashboard.putData("Auto choices", chooser);
	}

	/**
	 * This is called once when the autonomous mode is started
	 */
	@Override
	public void autonomousInit() {
		auto = (Command) chooser.getSelected();
		auto.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This is called once when the Teleop mode is started
	 */
	@Override
	public void teleopInit() {
		Teleop.Init();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		OI.refreshAll();
		Teleop.Periodic();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		// Put code you want to test here
		// It is recommended to put functions here in order to keep it clean
	}

}
