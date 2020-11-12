package com.company;

public class KFZVersicherung {
    String vNummer, amtlichesKennzeichen;
    KFZHaftpflicht haftpflicht;
    Autoschutzbrief autoschutzbrief;
    Kunde kunde;

    public KFZVersicherung(String vNummer, Kunde kunde,long deckungsumme) {
        this.vNummer = vNummer;

        this.haftpflicht=new KFZHaftpflicht(deckungsumme);

    }

    @Override
    public String toString() {
        return "KFZVersicherung{" +
                "vNummer='" + vNummer + '\'' +
                ", amtlichesKennzeichen='" + amtlichesKennzeichen + '\'' +
                ", haftpflicht=" + haftpflicht +
                ", autoschutzbrief=" + autoschutzbrief +
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
