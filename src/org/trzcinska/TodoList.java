package org.trzcinska;


import java.util.*;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i) != null) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
    }

    public void remove(int number) {
        if (todos.get(number) != null) {
            todos.remove(number);
        }
    }

}




