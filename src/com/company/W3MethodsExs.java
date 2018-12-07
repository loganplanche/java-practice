package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class W3MethodsExs {

    //Exercice 1
    private static int smallestAmongThree(int int1, int int2, int int3) {
        int smallest;
        if (int1 < int2 && int1 < int3) {
            smallest = int1;
        } else if (int2 < int3) {
            smallest = int2;
        } else {
            smallest = int3;
        }
        return smallest;
    }

    //Exercice 2
    private static int averageOf(int int1, int int2, int int3) {
        int average;
        average = (int1 + int2 + int3) / 3;
        return average;
    }

    //Exercice 3
    private static char[] middleCharOfString(String s) {
        char[] stringToCharArray;
        stringToCharArray = s.toCharArray();

        if (stringToCharArray.length % 2 == 0) {
            char[] retourne2char = new char[2];
            retourne2char[0] = stringToCharArray[stringToCharArray.length / 2];
            retourne2char[1] = stringToCharArray[stringToCharArray.length / 2 - 1];
            return retourne2char;
        } else {
            char[] retourne1char = new char[1];
            retourne1char[0] = stringToCharArray[stringToCharArray.length / 2];
            return retourne1char;
        }
    }

    //Exercice 4
    private static int countVowelsInString(String s) {
        int nbVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' ||
                    s.charAt(i) == 'y') {
                nbVowels++;
            }
        }
        return nbVowels;
    }

    //Exercice 5
    private static int countWordsInString(String s) {
        int words = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words++;
            }
        }
        return words;
    }

    //Exercice 6
    private static int sumOfDigitsOfInt(int entier) {
        int sumDigits = 0;
        while (entier > 0) {
            sumDigits += entier % 10;
            entier /= 10;
        }
        return sumDigits;
    }

    //Exercice 7
    private static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }

    //Exercice 13
    private static double getAreaOfTriangle(double coteA, double coteB, double coteC) {
        double perimeter = coteA + coteB + coteC;
        double semiPerimeter = perimeter / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - coteA) * (semiPerimeter - coteB) * (semiPerimeter - coteC));
        return area;
    }

    //Exercice 14
    private static double getAreaOfPentagon(double side) {
        double tan36 = Math.toRadians(36);
        double hauteurTriangleRectangle = (side / 2) / Math.tan(tan36);
        double aireTriangleRectangle = 0.5 * (side / 2) * (hauteurTriangleRectangle);
        double airePentagone = 10 * aireTriangleRectangle;
        return airePentagone;
    }

    //Exercice 15
    private static void displayCurrentDateAndTime() {
        Date d = new Date();
        System.out.println("Les date et heure actuelles sont " + d);
    }

    //Exercice 16
    private static boolean isPrime(int aTester) {
        if (aTester < 2) return false;

        for (int i = 2; i <= aTester / 2; i++) {
            if (aTester % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                int twin = i + 2;
                System.out.println(i + "," + twin);
            }
        }


        /* Ex 1
        System.out.println(smallestAmongThree(1,2,3));
        System.out.println(smallestAmongThree(1,3, 2));
        System.out.println(smallestAmongThree(3,2,1));
        System.out.println(smallestAmongThree(3,1,2));
        */

        /* Ex 2
        System.out.println(averageOf(25, 45, 65));
        System.out.println(averageOf(5, 70, 265));
        System.out.println(averageOf(0, 1, 0));
        */

        /* Ex 3
        //Cas even (pair) -> 2 caractères
        System.out.println(middleCharOfString("00011000"));
        //Cas odd (impair) -> 1 caractère
        System.out.println(middleCharOfString("0001000"));
        */

        /* Ex 4
        //7
        System.out.println(countVowelsInString("Rollin' like a stoner"));
        //0
        System.out.println(countVowelsInString("RRRrrrr!"));
        */

        /* Ex 5
        System.out.println(countWordsInString("The quick brown fox jumps over the lazy dog"));
        System.out.println(countWordsInString("Word."));
        System.out.println(countWordsInString("Two words"));
        */

        /* Ex 6
        //17
        System.out.println(sumOfDigitsOfInt(1547));
        //45
        System.out.println(sumOfDigitsOfInt(514789623));
        */

        /* Ex7
        int count = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (count % 10 == 0) System.out.println();
            count++;
        }
         */

        /* Exercice 13
        //72.61
        System.out.println(getAreaOfTriangle(10, 15, 20));
        */

        /* Exercice 14
        System.out.println(getAreaOfPentagon(6));
        */

        /* Exercice 15
        displayCurrentDateAndTime();
        */

        /* Exercice 16
        */
    }
}
