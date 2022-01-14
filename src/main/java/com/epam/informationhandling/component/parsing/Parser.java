package com.epam.informationhandling.component.parsing;

import com.epam.informationhandling.component.Composite;

public interface Parser {

    Composite parse(String text);
}
