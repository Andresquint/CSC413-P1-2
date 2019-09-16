package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
public class PowerOperator extends Operator {
    @Override
    public int priority() {
        // TODO Auto-generated method stub
        return 3;
    }

    // TODO Auto-generated method stub
    @Override
    public Operand execute(Operand op1, Operand op2) {
        Operand result;
        result = new Operand ((int) Math.pow(op1.getValue(), op2.getValue()));
        return result;
    }
}

