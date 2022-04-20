package memes.task1;

public class DarkSoulsFan implements Observer<Game> {
    public DarkSoulsFan() {
    }

    @Override
    public void update(Game item) {
        System.out.println("DS fan " + item.getTitle());
    }
}
