package com.mkk.ugd.interfaces.basic.nonliving;

import com.mkk.ugd.interfaces.basic.utility.Ucabilir;

public abstract class AbstractHavaMotorluTasiti extends MotorluTasit implements Ucabilir
{
    private int ucmaAparatiAdet;

    public AbstractHavaMotorluTasiti(String marka, Integer yil, Motor motor, int ucmaAparatiAdet)
    {
        super(marka, yil, motor);
        this.ucmaAparatiAdet = ucmaAparatiAdet;
    }

    @Override
    public String toString()
    {
        return "HavaMotorluTasiti{" +
                "ucmaAparatiAdet=" + ucmaAparatiAdet +
                "} " + super.toString();
    }
}
