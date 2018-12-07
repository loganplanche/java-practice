package com.company;

import java.util.Scanner;

public class Palindrome {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.print("Entrez un mot ou une phrase à tester :");
        String entreeBrute = sc.nextLine();
        String entreeATester = entreeBrute.toLowerCase();

        String allowedList = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";

        for (int i = 0; i < entreeATester.length(); i++) {
            char c = entreeATester.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        entreeATester = temp;

        int leftPos = 0;
        int rightPos = entreeATester.length() - 1;
        boolean estUnPalindrome = true;
        while ((leftPos < rightPos) && estUnPalindrome) {
            if (entreeATester.charAt(leftPos) != entreeATester.charAt(rightPos)) {
                estUnPalindrome = false;
            }
            leftPos++;
            rightPos--;
        }

        if (estUnPalindrome) {
            System.out.println("C'est un palindrôme.");
        } else {
            System.out.println("Ce n'est pas un palindrôme.");
        }
    }

}
