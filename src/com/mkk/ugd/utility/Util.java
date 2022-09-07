package com.mkk.ugd.utility;

import javax.swing.*;

public final class Util
{
    private Util() {}

    private static String createGeneralExceptionInfo(Exception e)
    {
        return e.getClass().getSimpleName() + " has been occured. Exception message" + e.getMessage();
    }

    public static void showGeneralExceptionInfo(Exception e)
    {
        showWarningMessage(e.getMessage(), e.getClass().getSimpleName());
    }

    public static void showInfoMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Info Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarningMessage(Object message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void showWarningMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Warning Message", JOptionPane.WARNING_MESSAGE);
    }

    public static void showErrorMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    public static void showQuestionMessage(Object message)
    {
        JOptionPane.showMessageDialog(null, message, "Question Message", JOptionPane.QUESTION_MESSAGE);
    }
}
