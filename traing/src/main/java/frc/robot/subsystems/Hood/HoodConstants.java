// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Hood;

import java.lang.Thread.State;

import frc.robot.subsystems.Shooter.Shooter;

/** Add your docs here. */
public class HoodConstants {

public static final State IDLE = new State("IDLE", Hood.getInstance());
public static final State SHOOT = new State("SHOOT", Hood.getInstance());
public static final State EJECT = new State("EJECT", Hood.getInstance());

   public static final double pick_current_limit = 30;
public static final double stator_current_limit = 15;

}
