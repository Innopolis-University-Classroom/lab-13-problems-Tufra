package memes.problem2;

import java.util.Stack;

public class History<T> {
    private Stack<Memento<T>> history;

    public History() {
        history = new Stack<>();
    }

    public void push(T item) {
        history.push(new Memento<>(item));
    }

    public int size() {
        return history.size();
    }

    public Memento<T> undo() {
        return history.pop();
    }
}
