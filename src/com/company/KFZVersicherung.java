package com.company;

import java.io.Serializable;

public class KFZVersicherung implements Serializable {
    String vNummer, amtlichesKennzeichen;
    KFZHaftpflicht haftpflicht;
    Autoschutzbrief autoschutzbrief;
    Kunde kunde;
    private static int auto=1000;

    public KFZVersicherung(Kunde kunde,long deckungsumme,String kennzeichen) {
        auto++;
        this.vNummer = "v"+auto;
        this.haftpflicht=new KFZHaftpflicht(deckungsumme);
        this.amtlichesKennzeichen=kennzeichen;
        this.kunde=kunde;
    }





    @Override
    public String toString() {
        return "KFZVersicherung{" +
                "vNummer='" + vNummer + '\'' +
                ", amtlichesKennzeichen='" + amtlichesKennzeichen + '\'' +
                ", haftpflicht=" + haftpflicht +
                ", autoschutzbrief=" + autoschutzbrief +
                ", kunde=" + kunde +
                '}';
    }

    public String getvNummer() {
        return vNummer;
    }

    public void setvNummer(String vNummer) {
        this.vNummer = vNummer;
    }

    public String getAmtlichesKennzeichen() {
        return amtlichesKennzeichen;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void setAmtlichesKennzeichen(String amtlichesKennzeichen) {
        this.amtlichesKennzeichen = amtlichesKennzeichen;
    }

    public KFZHaftpflicht getHaftpflicht() {
        return haftpflicht;
    }

    public void setHaftpflicht(KFZHaftpflicht haftpflicht) {
        this.haftpflicht = haftpflicht;
    }

    public Autoschutzbrief getAutoschutzbrief() {
        return autoschutzbrief;
    }

    public void setAutoschutzbrief(Autoschutzbrief autoschutzbrief) {
        this.autoschutzbrief = autoschutzbrief;
    }

    public void hinzufügenAutoschutzbrief(int weltweit) {
        this.autoschutzbrief = new Autoschutzbrief(weltweit);
    }

    public void loeschenAutoschutzbrief() {
        this.autoschutzbrief = null;
    }
}
