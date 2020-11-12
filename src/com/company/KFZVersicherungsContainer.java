package com.company;

import java.util.ArrayList;

public class KFZVersicherungsContainer {
    private ArrayList<KFZVersicherung> alleKFZVersicherungen;
    private ArrayList<Kunde> alleKunden;

    public KFZVersicherungsContainer() {
        this.alleKFZVersicherungen = new ArrayList<KFZVersicherung>();
        this.alleKunden = new ArrayList<Kunde>();
    }


    public void hinzufuegenVersicherung(KFZVersicherung versicherung){
        alleKFZVersicherungen.add(versicherung);
        versicherung.getKunde().getKfzVersicherungen().add(versicherung);
    }
    public KFZVersicherung findeVersicherung(String vNummer){
        for (KFZVersicherung v:alleKFZVersicherungen) {
            if (vNummer.equalsIgnoreCase(v.vNummer)){
                return v;
            }
        }
        return null;
    }
    public Kunde anlegenNeuerKunde(String vorname,String name,String geburtsDatum){
        Kunde k=new Kunde(vorname,name,geburtsDatum);
        this.getAlleKunden().add(k);
        return k;
    }
    public KFZVersicherung anlegenNeueKFZVersicherung(Kunde kunde,long deckungsumme,String kennzeichen){
        KFZVersicherung v=new KFZVersicherung(kunde,deckungsumme,kennzeichen);
        alleKFZVersicherungen.add(v);
        return v;
    }
    public void hinzufügenAutoschutzbrief(String vNummer,int weltweit) {
        findeVersicherung(vNummer).hinzufügenAutoschutzbrief(weltweit);
    }
    public Kunde findKundeByName(String vorname, String Nachname){
        for (Kunde k:alleKunden) {
            if ((k.getVorname().equalsIgnoreCase(vorname))&&(k.getName().equalsIgnoreCase(Nachname))){
                System.out.println("gefunden");
                return k;

            }
        }
        return null;
    }


    public ArrayList<KFZVersicherung> getAllVertraege(Kunde k){
        ArrayList<KFZVersicherung> ausgabe=new ArrayList<KFZVersicherung>();
        for (KFZVersicherung v:alleKFZVersicherungen) {
           if (k.equals(v.kunde)) ausgabe.add(v);
        }
        return ausgabe;
    }
    public ArrayList<Kunde> getAlleKunden() {
        return alleKunden;
    }
    public ArrayList<KFZVersicherung> getAlleKFZVersicherungen(){
        return alleKFZVersicherungen;
    }


    public void setAlleKFZVersicherungen(ArrayList<KFZVersicherung> alleKFZVersicherungen) {
        this.alleKFZVersicherungen = alleKFZVersicherungen;
    }
    public void setAlleKunden(ArrayList<Kunde> alleKunden) {
        this.alleKunden = alleKunden;
    }
}
