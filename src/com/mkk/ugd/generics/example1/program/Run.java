package com.mkk.ugd.generics.example1.program;

import com.mkk.ugd.generics.Motor;
import com.mkk.ugd.utility.Util;

public class Run
{
    public static void main(String[] args)
    {
        Motor motor1 = new Motor();
        MotorVehicle<Motor> motorMotorVehicle1 = new MotorVehicle<>(motor1);

        String motor2 = new String("140 hp 2.5 cc motor üst kapak yenilemesi yapıldı");
        MotorVehicle<String> motorMotorVehicle2 = new MotorVehicle<>(motor2);

        Util.showInfoMessage(motorMotorVehicle1);

        Util.showInfoMessage(motorMotorVehicle2);
    }
}
