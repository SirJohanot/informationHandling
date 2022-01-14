package com.epam.informationhandling.component.parsing;

import com.epam.informationhandling.component.Component;
import com.epam.informationhandling.component.Composite;

public class ParagraphParser extends AbstractParser {

    private static final String REGEX_TO_MATCH_WHITESPACE_AFTER_SENTENCE_TERMINATOR = "(?<=[\\.\\?\\!(\\.\\.\\.)])\\w";

    public ParagraphParser(Parser successor) {
        super(successor);
    }

    @Override
    public Composite parse(String text) {
        Composite composite = new Composite();
        String[] sentences = text.split(REGEX_TO_MATCH_WHITESPACE_AFTER_SENTENCE_TERMINATOR);
        for (String sentence : sentences) {
            Component sentenceComponent = getSuccessor().parse(sentence);
            composite.add(sentenceComponent);
        }
        return composite;
    }
}
