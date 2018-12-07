package com.company;

public class ReverseString {

    private static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            result.append(s.charAt(i));
            //System.out.println(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inverse = reverse("kayak");
        System.out.println(inverse);
    }
}
