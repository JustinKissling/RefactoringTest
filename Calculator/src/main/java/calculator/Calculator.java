package calculator;

public class Calculator extends SuperCalculator {
	// Test Fork
    private String resultAsText;

    public static final int MULTIPLIER = 10;

    @Override
    public double addition(double a, double b) {
        // int i = a + b;
        // int j = a - b;
        return a + b;
    }

    public double multiplikation(double a, double b, double c) {
        /*
        int i = a + b;
        Blubb
        */
        return a * b;
    }

    public double subtraction(double a, double b) {
        /**
         * int i = a + b;
         * 
         * Und hier ein richtiger Kommentar!
         */
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}

