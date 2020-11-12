package com.company;

import java.io.Serializable;

public class Autoschutzbrief implements Serializable {
    private static double jahresgebuehr=100;
    private int weltweit;

    public Autoschutzbrief(int weltweit) {
        this.weltweit = weltweit;
    }

    @Override
    public String toString() {
        return "Autoschutzbrief{" +
                "weltweit=" + weltweit +
                '}';
    }

    public static double getJahresgebuehr() {
        return jahresgebuehr;
    }

    public static void setJahresgebuehr(double jahresgebuehr) {
        Autoschutzbrief.jahresgebuehr = jahresgebuehr;
    }

    public int getWeltweit() {
        return weltweit;
    }

    public void setWeltweit(int weltweit) {
        this.weltweit = weltweit;
    }
}
