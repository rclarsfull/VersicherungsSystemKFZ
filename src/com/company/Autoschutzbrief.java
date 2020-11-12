package com.company;

public class Autoschutzbrief {
    private static double jahresgebuehr=100;
    private int weltweit;

    public Autoschutzbrief(int weltweit) {
        this.weltweit = weltweit;
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
