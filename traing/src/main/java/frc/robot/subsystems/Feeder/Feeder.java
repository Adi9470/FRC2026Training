// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Feeder;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.wpilibj.DigitalInput;

/** Add your docs here. */
public class Feeder {

    private static Feeder feeder;

    private final TalonFX feederMotor;

    private final StatusSignal<AngularVelocity> feederAnglarVelocity;

    private DigitalInput digitalInput;

    public Feeder(){
    feederMotor = new TalonFX (4);

    feederAnglarVelocity = feederMotor.getAngularVelocity(); 

    digitalInput = new DigitalInput(1);
    System.out.println(digitalInput.get());
    }

    public void setVoltage(int Voltage){
        feederMotor.setVoltage(Voltage);
    }

    public double getAngularVelocity(){
        return feederAnglarVelocity.getValueAsDouble()*(3/5);
    }

    
}
