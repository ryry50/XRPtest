// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;

public class AutoShape extends SequentialCommandGroup {
  //constants and conversion initialized
  Constants.DriveConstants driveCon;
  public double distance(double cm){
    return cm / driveCon.cmToInch;
  }

  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutoShape(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(driveCon.drivespeed, distance(10), drivetrain),
        new TurnDegrees(driveCon.drivespeed, 70, drivetrain),
        new DriveDistance(driveCon.drivespeed, distance(10), drivetrain),
        new TurnDegrees(driveCon.drivespeed, 80, drivetrain),
        new DriveDistance(driveCon.drivespeed, distance(9), drivetrain),
        new TurnDegrees(driveCon.drivespeed, 64, drivetrain),
        new DriveDistance(driveCon.drivespeed, distance(9), drivetrain),
        new TurnDegrees(driveCon.drivespeed, 80, drivetrain),
        new DriveDistance(driveCon.drivespeed, distance(10), drivetrain));
  }
}
