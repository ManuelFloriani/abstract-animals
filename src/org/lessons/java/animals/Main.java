package org.lessons.java.animals;

import java.util.Scanner;

public class Main {
    //        metodo fai volare
    public static void vola(Volante animale) {
        animale.vola();
    }

    //        metodo fai nuotare
    public static void nuota(Natante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {


        Animale naso = new Cane("Naso");
        Animale flipper = new Delfino("Flipper");
        Animale titti = new Passerotto("Titti");
        Animale giggi = new Aquila("Giggi");

// Passo gli animali creati in un array
        Animale[] animali = {naso, titti, giggi, flipper};


        for (Animale animale : animali) {
            System.out.println(animale.getName());
            animale.dormi();
            animale.verso();
            animale.mangia();

            if (animale instanceof Natante) {
                nuota((Natante) animale);
            } else if (animale instanceof Volante) {
                vola((Volante) animale);
            }
            System.out.println("-------");
        }
    }
}