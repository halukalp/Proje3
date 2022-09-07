package com.mkk.ugd.interfaces.basic.nonliving;

public class Ucak extends AbstractHavaMotorluTasiti
{

    public Ucak(String marka, Integer yil, Motor motor, int ucmaAparatiAdet) {
        super(marka, yil, motor, ucmaAparatiAdet);
    }

    @Override
    public void uc()
    {
        // bu metodun işlenmesi
        // uçakta uçmayı sağlayan property'ler aracılığı ile olacak
    }
}
