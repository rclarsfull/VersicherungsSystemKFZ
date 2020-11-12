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
    }

    public KFZVersicherung findeVersicherung(String vNummer){
        for (KFZVersicherung v:alleKFZVersicherungen) {
            if (vNummer.equalsIgnoreCase(v.vNummer)){
                return v;
            }
        }
        return null;
    }

    public ArrayList<KFZVersicherung> getAlleKFZVersicherungen(){
        return alleKFZVersicherungen;
    }


}
