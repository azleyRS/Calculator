package com.example.rus.meet16practice;

public class Presenter {
    private MainActivity mainActivity;
    private Calculator calculator;

    private String calculationResult = "";
    private String result = "";
    private String val1 = "";
    private String val2 = "";

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';

    private char ACTION = 0;





    Presenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        calculator = new Calculator();
    }

    public void numberPressed(int i) {
        setupVals(i);
    }

    public void clean() {
        mainActivity.clean();
        result = "";
        val1 = "";
        val2 = "";
        ACTION = 0;
        calculationResult = "";
        mainActivity.setButtonsEnabled();
    }

    public void addPressed() {
        if (!val1.equals("")){
            ACTION = ADDITION;
            setupResult();
        }
    }

    public void divPressed() {
        if (!val1.equals("")) {
            ACTION = DIVISION;
            setupResult();
        }
    }

    public void evaluatePressed() {
        if (ACTION != 0 && !val2.equals("")){
            calculationResult = calculator.evaluate(val1,val2,ACTION);
            setupResult();
            mainActivity.setButtonsDisabled();
        }
    }

    public void MultPressed() {
        if (!val1.equals("")) {
            ACTION = MULTIPLICATION;
            setupResult();
        }
    }

    public void SubPressed() {
        if (!val1.equals("")) {
            ACTION = SUBTRACTION;
            setupResult();
        }
    }

    private void setupVals(int i) {
        if (ACTION == 0){
            val1 = val1 + i;
        } else {
            val2 = val2 + i;
        }
        setupResult();
    }
    private void setupResult(){
        result = val1 +" "+ ACTION +" "+ val2;

        if (calculationResult != ""){
            result = result + " = " + calculationResult;
        }
        mainActivity.setResult(result);
    }
}
