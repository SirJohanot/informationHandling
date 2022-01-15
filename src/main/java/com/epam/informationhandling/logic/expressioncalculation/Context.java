package com.epam.informationhandling.logic.expressioncalculation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Context {

    private final Deque<Integer> stack = new ArrayDeque<>();

    public void push(Integer integer) {
        stack.push(integer);
    }

    public Integer pop() {
        return stack.pop();
    }
}
