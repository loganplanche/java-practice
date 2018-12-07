package com.company;

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        char[] tempArray = String.valueOf(num).toCharArray();
        Arrays.sort(tempArray);
        return Integer.parseInt(new StringBuilder(new String(tempArray)).reverse().toString());
    }

    public static void main(String[] args) {
        int numATester = 65489743;
        int resultat = sortDesc(numATester);
        System.out.println(resultat);
    }
}
