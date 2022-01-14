package com.epam.informationhandling.component.parsing;

import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;

public class TextParser extends AbstractParser {

    private static final String PARAGRAPH_DELIMITER = "\n";

    public TextParser(Parser successor) {
        super(successor);
    }

    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        String[] paragraphs = text.split(PARAGRAPH_DELIMITER);
        for (String paragraph : paragraphs) {
            Component paragraphComposite = getSuccessor().parse(paragraph);
            composite.add(paragraphComposite);
        }
        return composite;
    }
}
