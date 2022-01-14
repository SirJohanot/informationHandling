package com.epam.informationhandling.component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getChildren() {
        return components;
    }

    public void setChildren(List<? extends Component> components) {
        components.clear();
        this.components.addAll(components);
    }

    public int getChildrenNumber() {
        return components.size();
    }

    @Override
    public Component get(int index) {
        return components.get(index);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Composite composite = (Composite) o;
        return components.equals(composite.components);
    }

    @Override
    public int hashCode() {
        return components.hashCode();
    }

    @Override
    public String toString() {
        return "Composite{" +
                "components=" + components +
                '}';
    }
}
