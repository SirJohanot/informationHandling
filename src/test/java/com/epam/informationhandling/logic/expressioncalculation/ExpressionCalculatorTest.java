package com.epam.informationhandling.logic.expressioncalculation;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionCalculatorTest {

    private static final ExpressionCalculator EXPRESSION_CALCULATOR = new ExpressionCalculator();
    private static final String FIRST_VALID_EXPRESSION = "[ 2 2 + 2 * ]";  //(2+2)*2
    private static final Integer ANSWER_TO_FIRST_VALID_EXPRESSION = 8;
    private static final String SECOND_VALID_EXPRESSION = "[ 8 2 5 * + 1 3 2 * + 4 - /]";  //(8+2*5)/(1+3*2-4)
    private static final Integer ANSWER_TO_SECOND_VALID_EXPRESSION = 6;

    @Test
    public void testCalculateShouldReturnTheRightAnswerForTheFirstValidExpression() {
        //given
        //when
        Integer actualAnswer = EXPRESSION_CALCULATOR.calculate(FIRST_VALID_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_FIRST_VALID_EXPRESSION, actualAnswer);
    }

    @Test
    public void testCalculateShouldReturnTheRightAnswerForTheSecondValidExpression() {
        //given
        //when
        Integer actualAnswer = EXPRESSION_CALCULATOR.calculate(SECOND_VALID_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_SECOND_VALID_EXPRESSION, actualAnswer);
    }
}
