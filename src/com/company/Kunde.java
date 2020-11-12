package com.company;

import java.util.ArrayList;

public class Kunde {
    String name,vorname,geburtsDatum;
    ArrayList<KFZVersicherung> kfzVersicherungen;

    Kunde (String vorname,String name,String geburtsDatum){
        this.vorname=vorname;
        this.name=name;
        this.geburtsDatum=geburtsDatum;
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

    public void hinzufuegenVersicherung(KFZVersicherung versicherung){
        kfzVersicherungen.add(versicherung);
    }
}
