package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        KFZVersicherungsContainer container=new KFZVersicherungsContainer();
	    KFZVersicherungsUI ui=new KFZVersicherungsUI(container);

        Scanner scanner=new Scanner(System.in);

        String tempvorname;
        String tempname;
        Kunde tempKunde;

	    boolean run=true;
	    int auswahl;

	    while (run){
            auswahl=scanner.nextInt();

	        switch (auswahl){
                case 1:
                    System.out.println("Kunde anlegen");
                    System.out.println("\n\n\n\n");
                    String vorname=scanner.next();
                    String name=scanner.next();
                    String geburtsdatum=scanner.next();
                    ui.anlegenNeuerKunde(vorname,name,geburtsdatum);
                    System.out.println("fertig");
                    break;
                case 2:
                    System.out.println("Versicherung anlegen");
                    System.out.println("\n\n\n\n");
                    tempvorname=scanner.next();
                    tempname=scanner.next();
                    long deckungssumme= scanner.nextLong();;
                    String kennzeichen= scanner.next();

                    ui.anlegenNeueVersicherung(ui.findKundByName(tempvorname,tempname),deckungssumme,kennzeichen );
                    System.out.println("fertig");

                    break;
                case 3:
                    tempvorname=scanner.next();
                    tempname=scanner.next();
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

                    break;

                case 9:
                    run=false;
                    break;
                default:
                    break;

            }
        }
    }
}
