package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        KFZVersicherungsContainer container=Save.laden();
        KFZVersicherungsUI ui=new KFZVersicherungsUI(container);

        String tempvorname;
        String tempname;
        Kunde tempKunde;
        String tempKennzeichen;
        String tempgeburtsdatum;
        ArrayList<KFZVersicherung> tempVertragListe;

	    boolean run=true;
	    int auswahl;

	    while (run){
            auswahl=Einlesen.readInt("Auswahl");

	        switch (auswahl){
                case 1:
                    System.out.println("Kunde anlegen");
                    System.out.println("\n\n\n\n");
                     tempvorname=Einlesen.readString("Vorname");
                     tempname=Einlesen.readString("Name");
                    tempgeburtsdatum=Einlesen.readString("Geburtsdatum");
                    ui.anlegenNeuerKunde(tempvorname,tempname,tempgeburtsdatum);
                    System.out.println("fertig");
                    break;
                case 2:
                    System.out.println("Versicherung anlegen");
                    System.out.println("\n\n\n\n");
                    tempvorname=Einlesen.readString("Vorname");
                    tempname=Einlesen.readString("Name");;
                    long deckungssumme= Einlesen.readInt("Deckungssumme");
                    String kennzeichen= Einlesen.readString("Kennzeichen");

                    ui.anlegenNeueVersicherung(ui.findKundByName(tempvorname,tempname),deckungssumme,kennzeichen );
                    System.out.println("fertig");

                    break;
                case 3:
                    tempvorname=Einlesen.readString("Vorname");
                    tempname=Einlesen.readString("Name");
                    tempKunde=ui.findKundByName(tempvorname,tempname);
                    if (tempKunde==null) {
                        ArrayList<KFZVersicherung> printversicherungen = ui.getAlleKFZVersicherungen();
                        for (KFZVersicherung v : printversicherungen) {
                            System.out.println(v.toString());
                        }
                    } else{
                        for (KFZVersicherung v : ui.getAllVertraege(tempKunde)) {
                            System.out.println(v.toString());
                        }
                    }

                    break;
                case 4:
                    System.out.println("Schuzbrief hinzufügen\n\n\n\n");
                    tempvorname=Einlesen.readString("Vorname");
                    tempname=Einlesen.readString("Name");
                    tempKennzeichen=Einlesen.readString("Kennzeichen");
                    tempKunde=ui.findKundByName(tempvorname,tempname);
                    tempVertragListe=ui.getAllVertraege(tempKunde);
                    for (KFZVersicherung v:tempVertragListe) {
                        if (v.amtlichesKennzeichen.equalsIgnoreCase(tempKennzeichen)){
                            v.hinzufügenAutoschutzbrief(1);
                        }

                    }



                    break;

                case 9:
                    Save.spreichern(container);
                    run=false;
                    break;
                default:
                    break;

            }
        }
    }
}
