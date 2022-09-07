package com.mkk.ugd.exceptions.example2.program;

import com.mkk.ugd.utility.Util;

import javax.swing.*;

public class Run
{
    private static final int LIM_MIN = 0;
    private static final int LIM_MAX = 100;

    public static void main(String[] args)
    {
        String strInput1 = JOptionPane.showInputDialog("Notunuzu giriniz: \n( " + LIM_MIN + " ve "
                + LIM_MAX + " arasında bir değer (int) giriniz. )");

        controlInput(strInput1);
    }

    private static void controlInput(String inputStr)
    {
        if(inputStr == null)
        {
            Util.showInfoMessage("Çıkış yapıldı.");
        }
        else
        {
            try
            {
                int input = Integer.parseInt(inputStr);

                if(input < LIM_MIN || input > LIM_MAX)
                {
                    throw new IllegalArgumentException(LIM_MIN + " ve " + LIM_MAX
                            + " aralığı dışındaki değerler geçersizdir.");
                }

                Util.showInfoMessage("Girilen not değeri: " + input);
            }
            catch (NumberFormatException e)
            {
                Util.showWarningMessage("Tamsayı (int) hariç bir değer girildi.");
            }
            catch (IllegalArgumentException e)
            {
                Util.showWarningMessage(e.getMessage());
            }
        }
    }
}
