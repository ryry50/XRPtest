// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class AutoShape extends SequentialCommandGroup {

  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutoShape(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(10), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 70, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(10), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 80, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(9), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 35, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(9), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 80, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(10), drivetrain),
        //extended to Head poly
        new TurnDegrees(Constants.DriveConstants.drivespeed, 21, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(5), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 48, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(3.6), drivetrain),
        new TurnDegrees(Constants.DriveConstants.drivespeed, 52, drivetrain),
        new DriveDistance(Constants.DriveConstants.drivespeed, Constants.DriveConstants.distance(5), drivetrain));
  }
}
