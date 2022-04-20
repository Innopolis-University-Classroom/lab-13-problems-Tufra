package memes.task1;

public class PlaystationFan implements Observer<Game> {
    public PlaystationFan() {
    }

    @Override
    public void update(Game item) {
        System.out.println("FS fan " + item.getTitle());
    }
}
