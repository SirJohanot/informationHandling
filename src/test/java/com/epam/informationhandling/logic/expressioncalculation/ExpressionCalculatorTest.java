package com.epam.informationhandling.logic.expressioncalculation;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionCalculatorTest {

    private static final String ADDITION_EXPRESSION = "[ 17 9 + ]";  //(2+2)*2
    private static final Integer ANSWER_TO_ADDITION = 26;
    private static final String SUBTRACTION_EXPRESSION = "[ 12 6 - ]";  //(2+2)*2
    private static final Integer ANSWER_TO_SUBTRACTION = 6;
    private static final String POSITIVE_MULTIPLICATION_EXPRESSION = "[ 5 6 * ]";  //(2+2)*2
    private static final Integer ANSWER_TO_POSITIVE_MULTIPLICATION = 30;
    private static final String NEGATIVE_MULTIPLICATION_EXPRESSION = "[ -45 2 * ]";  //(2+2)*2
    private static final Integer ANSWER_TO_NEGATIVE_MULTIPLICATION = -90;
    private static final String POSITIVE_DIVISION_EXPRESSION = "[ 18 9 / ]";  //(2+2)*2
    private static final Integer ANSWER_TO_POSITIVE_DIVISION = 2;
    private static final String NEGATIVE_DIVISION_EXPRESSION = "[ -25 5 / ]";  //(2+2)*2
    private static final Integer ANSWER_TO_NEGATIVE_DIVISION = -5;
    private static final String ADVANCED_EXPRESSION = "[ 8 2 5 * + 1 3 2 * + 4 - /]";  //(8+2*5)/(1+3*2-4)
    private static final Integer ANSWER_TO_ADVANCED_EXPRESSION = 6;

    private final ExpressionCalculator expressionCalculator = new ExpressionCalculator();

    @Test
    public void testCalculateShouldReturnCalculateAdditionExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(ADDITION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_ADDITION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculateSubtractionExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(SUBTRACTION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_SUBTRACTION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculatePositiveMultiplicationExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(POSITIVE_MULTIPLICATION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_POSITIVE_MULTIPLICATION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculateNegativeMultiplicationExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(NEGATIVE_MULTIPLICATION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_NEGATIVE_MULTIPLICATION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculatePositiveDivisionExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(POSITIVE_DIVISION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_POSITIVE_DIVISION, actualAnswer);
    }

    @Test
    public void testCalculateShouldCalculateNegativeDivisionExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(NEGATIVE_DIVISION_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_NEGATIVE_DIVISION, actualAnswer);
    }

    @Test
    public void testCalculateShouldReturnTheRightAnswerForAnAdvancedExpression() {
        //given
        //when
        Integer actualAnswer = expressionCalculator.calculate(ADVANCED_EXPRESSION);
        //then
        Assert.assertEquals(ANSWER_TO_ADVANCED_EXPRESSION, actualAnswer);
    }
}
