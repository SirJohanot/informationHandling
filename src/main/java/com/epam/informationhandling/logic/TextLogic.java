package com.epam.informationhandling.logic;

import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;
import com.epam.informationhandling.component.Lexeme;
import com.epam.informationhandling.component.parsing.Parser;
import com.epam.informationhandling.component.parsing.TextParserBuilder;
import com.epam.informationhandling.logic.comparator.ChildComponentsComparator;
import com.epam.informationhandling.logic.comparator.TargetCharacterNumberComparator;

import java.util.ArrayList;
import java.util.List;

public class TextLogic {

    public Composite parse(String text) {
        TextParserBuilder builder = new TextParserBuilder();
        Parser parser = builder.build();
        return parser.parse(text);
    }

    public void sortParagraphsBySentenceNumber(Composite text) {
        List<Composite> paragraphs = new ArrayList<>();
        for (Component component : text.getChildren()) {
            paragraphs.add((Composite) component);
        }
        paragraphs.sort(new ChildComponentsComparator());
        text.setChildren(paragraphs);
    }

    public void sortWordsByTargetCharacterNumber(Composite sentence, char targetCharacter) {
        List<Lexeme> lexemes = new ArrayList<>();
        for (Component component : sentence.getChildren()) {
            lexemes.add((Lexeme) component);
        }
        lexemes.sort(new TargetCharacterNumberComparator(targetCharacter));
        sentence.setChildren(lexemes);
    }

}
