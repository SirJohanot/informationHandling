package com.epam.informationhandling.logic.expressioncalculation;

public class NonTerminalExpression implements MathExpression {

    private final int number;

    public NonTerminalExpression(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {
        context.push(number);
    }
}
