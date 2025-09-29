// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class Parking extends SequentialCommandGroup {

  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public Parking(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(Constants.DriveConstants.drivespeed, 13, drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 45, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, -0.5, drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 30, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, 2, drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 20, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, 5, drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 95, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, 7, drivetrain));
        
  }
}
