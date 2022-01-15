package com.epam.informationhandling.logic.expressioncalculation;

public class TerminalDivideExpression implements MathExpression {
    @Override
    public void interpret(Context context) {
        Integer secondMember = context.pop();
        Integer firstMember = context.pop();
        context.push(firstMember / secondMember);
    }
}
