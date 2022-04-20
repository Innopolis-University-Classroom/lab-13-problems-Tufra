package memes.problem2;

public class Service {
    private String state;
    private History<String> history;

    public Service() {
        history = new History<>();
    }

    public void doRepair(String item) {
        state = item;
        System.out.println("do " + state);
        history.push(state);
    }

    public void goBack() {
        while (history.size() > 0) {
            undo();
            System.out.println("undo " + state);
        }
    }

    public void undo() {
        state = history.undo().getState();
    }

    public String getState() {
        return state;
    }
}
