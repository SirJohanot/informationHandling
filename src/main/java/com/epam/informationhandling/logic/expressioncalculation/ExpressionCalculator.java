package com.epam.informationhandling.logic.expressioncalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpressionCalculator {

    private final List<MathExpression> mathExpressionList = new ArrayList<>();

    public Integer calculate(String expression) {
        mathExpressionList.clear();
        for (String lexeme : expression.split(" ")) {
            if (lexeme.isEmpty()) {
                continue;
            }
            switch (lexeme.charAt(0)) {
                case '+':
                    mathExpressionList.add(new TerminalPlusExpression());
                    break;
                case '-':
                    mathExpressionList.add(new TerminalMinusExpression());
                    break;
                case '*':
                    mathExpressionList.add(new TerminalMultiplyExpression());
                    break;
                case '/':
                    mathExpressionList.add(new TerminalDivideExpression());
                    break;
                default:
                    Scanner scanner = new Scanner(lexeme);
                    if (scanner.hasNextInt()) {
                        mathExpressionList.add(new NonTerminalExpression(scanner.nextInt()));
                    }
            }
        }
        return finaliseCalculation();
    }

    private Integer finaliseCalculation() {
        Context context = new Context();
        for (MathExpression expression : mathExpressionList) {
            expression.interpret(context);
        }
        return context.pop();
    }
}
