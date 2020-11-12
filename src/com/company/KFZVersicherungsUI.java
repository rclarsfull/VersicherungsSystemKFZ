package com.company;

import java.util.ArrayList;

public class KFZVersicherungsUI {

    KFZVersicherungsContainer container;

    public KFZVersicherungsUI(KFZVersicherungsContainer c) {
        this.container=c;
    }

    public void hinzufuegenVersicherung(KFZVersicherung versicherung){
        container.hinzufuegenVersicherung(versicherung);
    }

    public void anzeigenAlleVersicherungen(){
        ArrayList<KFZVersicherung>alleKFZVersicherungen=container.getAlleKFZVersicherungen();
        for (KFZVersicherung k:alleKFZVersicherungen) {
            System.out.println(k.toString());
        }
    }

    public Kunde anlegenNeuerKunde(String vorname, String name, String geburtsDatum){
        return container.anlegenNeuerKunde(vorname,name,geburtsDatum);
    }

    public KFZVersicherung findeKFZVersicherung(String vNummer){
        return container.findeVersicherung(vNummer);
    }

    public KFZVersicherung anlegenNeueVersicherung(Kunde kunde,long deckungsumme,String kennzeichen){
        return container.anlegenNeueKFZVersicherung(kunde,deckungsumme,kennzeichen);
    }
    public void hinzufügenAutoschutzbrief(String vNummer,int weltweit){
        container.hinzufügenAutoschutzbrief(vNummer,weltweit);
    }

    public Kunde findKundByName(String vorname,String Nachname){
        return container.findKundeByName(vorname, Nachname);
    }

    public ArrayList<KFZVersicherung> getAlleKFZVersicherungen(){
        return container.getAlleKFZVersicherungen();
    }

    public ArrayList<KFZVersicherung> getAllVertraege(Kunde k){
        return container.getAllVertraege(k);
    }


}
