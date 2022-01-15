package com.epam.informationhandling.component.parsing;

import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;

public abstract class AbstractParser implements Parser {

    private final Parser successor;

    public AbstractParser(Parser successor) {
        this.successor = successor;
    }

    public AbstractParser() {
        successor = null;
    }

    public Parser getSuccessor() {
        return successor;
    }

    protected Composite templateParse(String text, String delimiterRegex) {
        Composite composite = new Composite();
        String[] paragraphs = text.split(delimiterRegex);
        for (String paragraph : paragraphs) {
            Component paragraphComposite = getSuccessor().parse(paragraph);
            composite.add(paragraphComposite);
        }
        return composite;
    }
}
