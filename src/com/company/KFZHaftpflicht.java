package com.company;

public class KFZHaftpflicht {
    private long deckungssumme;
    private int typklasse;

    public KFZHaftpflicht(long deckungssumme) {
        this.deckungssumme = deckungssumme;
    }

    public long getDeckungssumme() {
        return deckungssumme;
    }

    public void setDeckungssumme(long deckungssumme) {
        this.deckungssumme = deckungssumme;
    }

    public int getTypklasse() {
        return typklasse;
    }

    public void setTypklasse(int typklasse) {
        this.typklasse = typklasse;
    }
}
