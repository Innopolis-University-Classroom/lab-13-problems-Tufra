package memes.task1;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class Playstation {
    private List<Observer<Game>> observers;

    public Playstation(List<Observer<Game>> observers) {
        this.observers = observers;
    }

    public Playstation() {
        observers = new ArrayList<>();
    }

    public void addGame(String title) {
        Game game = new Game(title);

        notify(game);
    }

    public Playstation subscribe(Observer<Game> observer) {
        observers.add(observer);

        return this;
    }

    public void notify(Game game) {
        for (Observer<Game> observer : observers) {
            observer.update(game);
        }
    }

    public List<Observer<Game>> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer<Game>> observers) {
        this.observers = observers;
    }
}
