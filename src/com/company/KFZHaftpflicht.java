package com.company;

import java.io.Serializable;

public class KFZHaftpflicht implements Serializable {
    private long deckungssumme;
    private int typklasse;

    public KFZHaftpflicht(long deckungssumme) {
        this.deckungssumme = deckungssumme;
    }

    @Override
    public String toString() {
        return "KFZHaftpflicht{" +
                "deckungssumme=" + deckungssumme +
                ", typklasse=" + typklasse +
                '}';
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
