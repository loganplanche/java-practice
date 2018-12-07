package com.company;

import java.util.ArrayList;
import java.util.List;

public class Unsurdeux {

    private static void unSurDeux(List<Integer> maListe) {
        int compteur = maListe.size();
        for (int i = 0; i < maListe.size(); i++) {
            if (i % 2 == 0) {
                maListe.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<>();
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);
        liste1.add(4);
        liste1.add(5);
        liste1.add(6);

        unSurDeux(liste1);

        for (int i = 0; i < liste1.size(); i++) {
            System.out.println(liste1.get(i));
        }
    }
}
