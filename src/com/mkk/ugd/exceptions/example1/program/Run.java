package com.mkk.ugd.exceptions.example1.program;

import com.mkk.ugd.utility.Util;

import javax.swing.*;
import java.awt.*;

public class Run
{
    public static void main(String[] args)
    {
        try
        {
            String strSayi1 = JOptionPane.showInputDialog("Bir sayı giriniz:");

            int sayi1 = Integer.parseInt(strSayi1);

            Util.showInfoMessage("Girilen sayının karesi: " + Math.pow(sayi1, 2));
        }
        catch (NumberFormatException e)
        {
            Util.showWarningMessage("Tamsayı (int) hariç bir değer girildi.");
        }
        catch (HeadlessException e)
        {
            Util.showGeneralExceptionInfo(e);
        }
    }
}
