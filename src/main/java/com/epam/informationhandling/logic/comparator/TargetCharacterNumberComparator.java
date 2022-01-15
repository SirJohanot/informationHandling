package com.epam.informationhandling.logic.comparator;

import com.epam.informationhandling.component.Lexeme;

import java.util.Comparator;

public class TargetCharacterNumberComparator implements Comparator<Lexeme> {

    private char targetCharacter;

    public TargetCharacterNumberComparator(char targetCharacter) {
        this.targetCharacter = targetCharacter;
    }

    @Override
    public int compare(Lexeme o1, Lexeme o2) {
        int targetCharacterNumberDifference = targetCharacterCount(o1.getValue()) - targetCharacterCount(o2.getValue());
        if (targetCharacterNumberDifference != 0) return targetCharacterNumberDifference;
        return o1.getValue().compareToIgnoreCase(o2.getValue());
    }

    private int targetCharacterCount(String lexeme) {
        int counter = 0;
        for (int i = 0; i < lexeme.length(); i++) {
            if (lexeme.charAt(i) == targetCharacter) {
                counter++;
            }
        }
        return counter;
    }
}
