// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Feeder;

import java.lang.Thread.State;

import frc.robot.subsystems.Shooter.Shooter;

/** Add your docs here. */
public class FeederConstants {

    public static  final State IDLE = new State("IDLE", Feeder.getInstance());
    public static final State HOLD = new State("HOLD", Feeder.getInstance());
    public static final State SHOOT = new State("SHHOT", Feeder.getInstance());
    public static final State FORWARD = new State("FORWARD", Feeder.getInstance());

    public static final double pick_current_limit = 60;
    public static final double stator_current_limit = 30;

}
