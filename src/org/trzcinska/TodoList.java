package org.trzcinska;


public class TodoList {
    private String[] todos;

    public TodoList() {

        todos = new String[10];

    }
    public void add(String task) {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = task;
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] != null) {
                System.out.println((i+1) + ". " + todos[i]);
            }
        }
    }

    public void remove(int number) {
        for (int i = 0; i < todos.length; i++) {
            if (i == number - 1 && todos[i] != null) {
                todos[i] = null;
                break;
            }
        }
    }

}




