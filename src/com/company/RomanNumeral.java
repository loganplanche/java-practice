package com.company;

public class RomanNumeral {

    private static final int[] VALUES = {9, 5, 4};
    private static final String[] SYMBOLS = {"IX", "V", "IV"};

    public static String convert(int nbArabe) {
        StringBuilder nbRomain = new StringBuilder();
        int reste = nbArabe;

        for (int i = 0; i < VALUES.length; i++) {
            reste = appendRomanNumeral(reste, VALUES[i], SYMBOLS[i], nbRomain);
        }
        for (int i = 0; i < reste; i++) {
            nbRomain.append("I");
        }
        return nbRomain.toString();
    }

    private static int appendRomanNumeral(int arabic, int value, String romanDigit, StringBuilder builder) {
        int result = arabic;
        if (result >= value) {
            builder.append(romanDigit);
            result -= value;
        }
        return result;
    }
}