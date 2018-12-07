package com.company;

public class FizzBuzzConverter {
    public String convert(int toConvertFizzBuzz) {

        if (toConvertFizzBuzz % 15 == 0) {
            return "FizzBuzz";
        }

        if (toConvertFizzBuzz % 5 == 0) {
            return "Buzz";
        }
        if (toConvertFizzBuzz % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(toConvertFizzBuzz);
    }
}
