package com.company;

import java.util.Scanner;

public class FactorielleIteratif {
    public static void main(String[] args) {
        int n;
        int factorielle = 1;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un nombre pour lequel calculer sa factorielle:");
        n = sc.nextInt();

        while (i <= n) {
            factorielle = factorielle * i;
            i++;
        }

        System.out.println(factorielle);
    }
}
