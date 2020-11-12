package com.company;
import java.io.*;
import java.util.Scanner;
public class Save {



        public static void spreichern(KFZVersicherungsContainer a){
            try(FileOutputStream fos=new FileOutputStream("saveContainer.txt") ;
                ObjectOutputStream oos=new ObjectOutputStream(fos)){
                oos.writeObject(a);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        public static KFZVersicherungsContainer laden(){
            try (FileInputStream fis=new FileInputStream("saveContainer.txt");
                 ObjectInputStream ois=new ObjectInputStream(fis)){
                return (KFZVersicherungsContainer) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("Dartei nicht gefunden");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("1");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("2");
            }
            System.out.println("Lade-Fehler!!!");
            KFZVersicherungsContainer container=new KFZVersicherungsContainer();
            spreichern(container);
            return container;

        }
    }
