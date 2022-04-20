package memes.problem1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FIFA {
    private Queue<Game> queue;

    public FIFA() {
        queue = new ArrayDeque<>();
    }

    public void addGame(Game game) {
        queue.add(game);
    }

    public void playNext() {
        if (!queue.isEmpty()) {
            Game game = queue.poll();
            game.notifyObs();
        }
    }
}
