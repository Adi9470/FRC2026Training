// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.Feeder.FeederConstants;
import frc.robot.subsystems.Hood.HoodConstants;
import frc.robot.subsystems.Shooter.ShooterConstant;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

    public static final RobotContainer IDLE = new RobotState(
      "IDLE",
      FeederConstants.IDLE,
      HoodConstants.IDLE,
      ShooterConstant.IDLE);

    public static final RobotContainer INTAKE = new RobotState(
      "INTAKE",
      FeederConstants.IDLE,
      HoodConstants.IDLE,
      ShooterConstant.IDLE);

    public static final RobotContainer HOLD = new RobotState(
      "HOLD",
      FeederConstants.HOLD,
      HoodConstants.IDLE,
      ShooterConstant.IDLE);

    public static final RobotContainer SHOOTING = new RobotState(
      "SHOOTING",
      FeederConstants.SHOOT,
      HoodConstants.SHOOT,
      ShooterConstant.SHOOT);
    
    public static final RobotContainer EJECT = new RobotState(
      "EJECT",
      FeederConstants.FORWARD,
      HoodConstants.EJECT,
      ShooterConstant.EJECT);
    
    public static final RobotContainer OPEN_WALLS = new RobotState(
      "OPEN_WALLS",
      FeederConstants.IDLE,
      HoodConstants.IDLE,
      ShooterConstant.IDLE
    );
  }
}
