package memes.problem1;

public class BarcelonaFan implements Observer<Game> {
    public BarcelonaFan() {
    }

    @Override
    public void update(Game item) {
        System.out.println("Barcelona fan " + item.getTitle());
    }
}
