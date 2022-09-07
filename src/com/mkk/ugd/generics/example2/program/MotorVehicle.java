package com.mkk.ugd.generics.example2.program;

public class MotorVehicle<Y, M>
{
    private String brand;
    private Y year;
    private M motor;

    public MotorVehicle(String brand, Y year, M motor) {
        this.brand = brand;
        this.year = year;
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Y getYear() {
        return year;
    }

    public void setYear(Y year) {
        this.year = year;
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
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", motor=" + motor +
                '}';
    }
}
