package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ManipulationListe {
    public static void main(String[] args) {
        ArrayList<Integer> maListeEntiers = new ArrayList<>();
        maListeEntiers.add(0);
        maListeEntiers.add(1);
        maListeEntiers.add(2);
        maListeEntiers.add(3);
        maListeEntiers.add(4);
        maListeEntiers.add(5);
        maListeEntiers.add(6);
        maListeEntiers.add(7);
        maListeEntiers.add(8);
        maListeEntiers.add(9);

        ArrayList<String> maListeStrings = new ArrayList<>();
        maListeStrings.add("A");
        maListeStrings.add("B");
        maListeStrings.add("C");
        maListeStrings.add("D");
        maListeStrings.add("E");
        maListeStrings.add("F");
        maListeStrings.add("G");
        maListeStrings.add("H");
        maListeStrings.add("I");
        maListeStrings.add("J");

        Iterator<String> monIterator = maListeStrings.iterator();

        for (int i = 0; i < maListeEntiers.size(); i++) {
            System.out.println(maListeEntiers.get(i));
        }

        supprimeEntiersPairs(maListeEntiers);

        for (int i = 0; i < maListeEntiers.size(); i++) {
            System.out.println(maListeEntiers.get(i));
        }


        supprimeUnElementSurDeux(maListeStrings);

        //Print elements via iterator
        while (monIterator.hasNext()) {
            System.out.println(monIterator.next());
        }

        //Print elements in for loop
        for (int i = 0; i < maListeStrings.size(); i++) {
            System.out.println(maListeStrings.get(i));
        }

    }

    private static void supprimeEntiersPairs(ArrayList<Integer> listeATraiter) {
        for (int i = 0; i < listeATraiter.size(); i++) {
            if (listeATraiter.get(i) % 2 == 0) {
                listeATraiter.remove(i);
            }
        }
    }

    private static void supprimeUnElementSurDeux(ArrayList<String> listeATraiter) {
        Iterator<String> iteratorPourTraiter = listeATraiter.iterator();
        int i = 0;
        while (iteratorPourTraiter.hasNext()) {
            String lettreEnCours = iteratorPourTraiter.next();

            if (i % 2 == 0) {
                iteratorPourTraiter.remove();
            }
            i++;
        }

    }

}

