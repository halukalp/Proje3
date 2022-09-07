package com.mkk.ugd.generics.example1.program;

public class MotorVehicle<M>
{
    private M motor;

    public MotorVehicle(M motor)
    {
        this.motor = motor;
    }

    public M getMotor() {
        return motor;
    }

    public void setMotor(M motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "motor=" + motor +
                '}';
    }
}
