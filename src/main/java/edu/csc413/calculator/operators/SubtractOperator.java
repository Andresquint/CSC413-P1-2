package edu.csc413.calculator.operators;


import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    @Override
    public int priority() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        // TODO Auto-generated method stub
        Operand op = new Operand (op1.getValue() - op2.getValue() );
        return op;
    }
}

