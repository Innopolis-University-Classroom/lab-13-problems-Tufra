package memes.problem1;

public class RealMadridFan implements Observer<Game> {
    public RealMadridFan() {
    }

    @Override
    public void update(Game item) {
        System.out.println("Real Madrid fan " + item.getTitle());
    }
}
