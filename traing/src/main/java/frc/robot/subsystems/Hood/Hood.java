// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Hood;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Velocity;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Shooter.Shooter;

/** Add your docs here. */
public class Hood extends SubsystemBase {

    private static Hood hood;

    private final TalonFX hoodMotor;

    private final StatusSignal<Angle> AngleHood;
    private final StatusSignal<AngularVelocity> VelocityHood;
    
    private CANcoder digitalInput;

    public Hood(){
       hoodMotor = new TalonFX (3);

       AngleHood= hoodMotor.getAngle();
       VelocityHood = hoodMotor.getVelocity();

       digitalInput = new CANcoder (0);
       digitalInput.getPosition();
       digitalInput.getVelocity();
    }

    public void setVoltage(int Voltage){
        hoodMotor.setVoltage(Voltage);
    }

    public double getAngle(){
        return AngleHood.getValueAsDouble()*(1/16);
    }

    public double getVelocity(){
        return VelocityHood.getValueAsDouble();
    } 

}
