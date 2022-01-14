package com.epam.informationhandling.component;

public interface Component {

    void add(Component component);

    Component get(int number);

    void remove(Component component);

}
