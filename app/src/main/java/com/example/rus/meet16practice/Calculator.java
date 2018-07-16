package com.example.rus.meet16practice;

public class Calculator {

    private Double result;

    public static double add(double number1, double number2){
        return number1 + number2;
    }

    public static double sub(double number1, double number2){
        return number1 - number2;
    }

    public static double mul(double number1, double number2){
        return number1 * number2;
    }

    public static double div(double number1, double number2){
        return number1 / number2;
    }

    public String evaluate(String val1, String val2, char action) {
        switch (action){
            case '+':
                result = add(Double.parseDouble(val1),Double.parseDouble(val2));
                break;
            case '-':
                result = sub(Double.parseDouble(val1),Double.parseDouble(val2));
                break;
            case '/':
                result = div(Double.parseDouble(val1),Double.parseDouble(val2));
                break;
            case '*':
                result = mul(Double.parseDouble(val1),Double.parseDouble(val2));
                break;
        }
        return String.valueOf(result);
    }
}
