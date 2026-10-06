// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Shooter;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class Shooter extends SubsystemBase {
    private static Shooter shooter;

    private final TalonFX shooterMotor;
    private final TalonFX shooterMotorSlave;
    private TalonFXConfiguration shooterMotorConfig;
    private TalonFXConfiguration shooterMotorSlaveConfig;

    private final StatusSignal<AngularVelocity> angularVelocitySignal;

    public Shooter(){
    shooterMotor = new TalonFX (1);
    shooterMotorSlave = new TalonFX (2);
    shooterMotorConfig = new TalonFXConfiguration();
    shooterMotorSlaveConfig = new TalonFXConfiguration();

    angularVelocitySignal = shooterMotor.getAngularVelocity(); 
    angularVelocitySignal = shooterMotorSlave.getAngularVelocity();

    shooterMotorConfig.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
    shooterMotorSlaveConfig.MotorOutput.Inverted = InvertedValue.CounterClockwise_Positive;
    }

    public void setVoltage(int Voltage){
        shooterMotor.setVoltage(Voltage);
        shooterMotorSlave.setVoltage(Voltage);
    }

    public double getAngularVelocity(){
        return angularVelocitySignal.getValueAsDouble()*(1/2);
    }
}
