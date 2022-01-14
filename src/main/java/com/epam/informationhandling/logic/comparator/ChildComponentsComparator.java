package com.epam.informationhandling.logic.comparator;

import com.epam.informationhandling.component.Composite;

import java.util.Comparator;

public class ChildComponentsComparator implements Comparator<Composite> {
    @Override
    public int compare(Composite o1, Composite o2) {
        return o1.getChildrenNumber() - o2.getChildrenNumber();
    }
}
