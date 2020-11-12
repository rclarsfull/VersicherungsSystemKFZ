package com.company;

import java.util.ArrayList;

public class Kunde {
    private String name,vorname,geburtsDatum;
    private ArrayList<KFZVersicherung> kfzVersicherungen;

    Kunde (String vorname,String name,String geburtsDatum){
        this.vorname=vorname;
        this.name=name;
        this.geburtsDatum=geburtsDatum;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburtsDatum='" + geburtsDatum + '\'' +
                ", kfzVersicherungen=" + kfzVersicherungen +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(String geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public ArrayList<KFZVersicherung> getKfzVersicherungen() {
        return kfzVersicherungen;
    }

    public void setKfzVersicherungen(ArrayList<KFZVersicherung> kfzVersicherungen) {
        this.kfzVersicherungen = kfzVersicherungen;
    }

    public void hinzufuegenVersicherung(KFZVersicherung versicherung){
        kfzVersicherungen.add(versicherung);
    }
}
