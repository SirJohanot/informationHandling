package com.epam.informationhandling.component.parsing;

import com.epam.informationhandling.component.Composite;
import com.epam.informationhandling.component.Lexeme;

public class SentenceParser extends AbstractParser {

    private static final String LEXEMES_DELIMITER = "[( (?=\\[))((?<=\\]) ) ]";

    public SentenceParser() {
        super();
    }

    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        String[] lexemes = text.split(LEXEMES_DELIMITER);
        for (String lexeme : lexemes) {
            Lexeme convertedLexeme;
            if (lexeme.contains("[")) {
                convertedLexeme = Lexeme.expression(lexeme);
            } else {
                convertedLexeme = Lexeme.word(lexeme);
            }
            composite.add(convertedLexeme);
        }
        return composite;
    }
}
