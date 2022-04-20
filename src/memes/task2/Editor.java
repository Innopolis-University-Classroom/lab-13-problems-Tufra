package memes.task2;

public class Editor {
    private String val;
    private History<String> history;

    public Editor() {
        history = new History<>();
    }

    public void write(String item) {
        history.push(val);
        val = item;
    }

    public void undo() {
        val = history.undo().getState();
    }

    public String getVal() {
        return val;
    }
}
