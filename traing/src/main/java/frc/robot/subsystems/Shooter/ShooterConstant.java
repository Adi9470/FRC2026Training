// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Shooter;

import java.lang.Thread.State;

/** Add your docs here. */
public class ShooterConstant {

public static  final State IDLE = new State("IDLE", Shooter.getInstance());
public static final State SHOOT = new State("SHOOT", Shooter.getInstance());
public static final State EJECT = new State("EJECT", Shooter.getInstance());

public static final double pick_current_limit = 80;
public static final double stator_current_limit =60;

}
