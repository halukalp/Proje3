package com.mkk.ugd.generics.example2.program;

import com.mkk.ugd.generics.Motor;
import com.mkk.ugd.interfaces.basic.utility.YakitTipi;
import com.mkk.ugd.utility.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run
{
    public static void main(String[] args)
    {
        String brand1 = "Renault Clio";
        Integer year1 = 2017;
        String motor1 = "90 hp 1.2 cc, cyclinder head gasket was changed";
        MotorVehicle<Integer, String> motorVehicle1 = new MotorVehicle<>(brand1, year1, motor1);
        Util.showInfoMessage(motorVehicle1);

        String brand2 = "Mercedes C 200d";
        String year2 = new SimpleDateFormat("dd-MM-y").format(new Date());
        Motor motor2 = new Motor(1.9, 200, YakitTipi.BENZIN);
        MotorVehicle<String, Motor> motorVehicle2 = new MotorVehicle<>(brand2, year2, motor2);
        Util.showInfoMessage(motorVehicle2);
    }
}
