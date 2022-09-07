package com.mkk.ugd.interfaces.basic.nonliving;

import com.mkk.ugd.interfaces.basic.utility.YakitTipi;

public class Motor
{
    private static final double VARSAYILAN_HACIM = 1.2;
    private static final int VARSAYILAN_GUC = 90;
    private static final YakitTipi VARSAYILAN_YAKIT = YakitTipi.HIBRIT;

    private double hacim;
    private int guc;
    private YakitTipi yakit;

    public Motor(double hacim, int guc, YakitTipi yakit)
    {
        this.hacim = hacim;
        this.guc = guc;
        this.yakit = yakit;
    }

    public Motor()
    {
        this(VARSAYILAN_HACIM, VARSAYILAN_GUC, VARSAYILAN_YAKIT);
    }

    public double getHacim() {
        return hacim;
    }

    public void setHacim(double hacim) {
        this.hacim = hacim;
    }

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public YakitTipi getYakit() {
        return yakit;
    }

    public void setYakit(YakitTipi yakit) {
        this.yakit = yakit;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hacim=" + hacim +
                ", guc=" + guc +
                ", yakit=" + yakit +
                '}';
    }
}
