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

    public KFZVersicherung findeKFZVersicherung(String vNummer){
        return container.findeVersicherung(vNummer);
    }
}
