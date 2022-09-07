package com.mkk.ugd.abstract_classes.program;


import com.mkk.ugd.abstract_classes.matters.Kup;
import com.mkk.ugd.abstract_classes.matters.Kure;
import com.mkk.ugd.abstract_classes.utility.MaddeTur;
import com.mkk.ugd.abstract_classes.utility.MaddeUtil;

public class Run
{
    public static void main(String[] args)
    {
        // kenar uzunluğu 2 cm olan altın bir küpün kütlesi
        Kup kup1 = new Kup(MaddeTur.ALTIN, 2);

        // yarıçapı 0.8 cm olan demir bir kürenin kütlesi
        Kure kure1 = new Kure(MaddeTur.DEMIR, 0.8);

        MaddeUtil.kutleBilgisiGoster(kup1);

        MaddeUtil.kutleBilgisiGoster(kure1);
    }
}
