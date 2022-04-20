package memes.problem1;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String title;
    private List<Observer<Game>> observers;

    public Game(String title) {
        this.title = title;
        observers = new ArrayList<>();
    }

    public void subscribe(Observer<Game> obs) {
        observers.add(obs);
    }

    public void notifyObs() {
        for (Observer<Game> observer : observers) {
            observer.update(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
