package com.company;

public class Calculator {

    private final String delimiter = ",|\n";

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(delimiter);
        if (isEmpty(input)) {
            return 0;
        }
        if (numbers.length == 1) {
            return strToInt(input);
        } else {
            return getSomme(numbers);
        }
    }

    private int getSomme(String[] numbers) throws Exception {
        findNegativeInput(numbers);
        int somme = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(strToInt(numbers[i])> 1000){
                continue;
            }
            somme = somme + strToInt(numbers[i]);
        }
        return somme;
    }

    private void findNegativeInput(String[] numbers) throws Exception {
        for (String current : numbers) {
            if (strToInt(current) < 0) {
                throw new Exception("Negative input");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int strToInt(String input) {
        return Integer.parseInt(input);
    }
}
