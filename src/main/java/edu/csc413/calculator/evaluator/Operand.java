package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {


    String token;

    public Operand(String token) {
        this.token = token;

    }

    /**
     * construct operand from integer
     */
    public Operand(double value) {
        this.token = String.valueOf(value);

    }

    /**
     * return value of operand
     */
    public double getValue() {

        return Double.parseDouble(token);
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch(Exception eventObject) {
            return false;
        }
    }

}
