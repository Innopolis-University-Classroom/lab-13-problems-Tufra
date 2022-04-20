package memes.problem1;

public class Main {
    public static void main(String[] args) {
        FIFA fifa = new FIFA();

        Observer<Game> rmf1 = new RealMadridFan();
        Observer<Game> bf2 = new BarcelonaFan();

        Game game1 = new Game("game1");
        game1.subscribe(rmf1);

        Game game2 = new Game("game2");
        game2.subscribe(rmf1);
        game2.subscribe(bf2);

        fifa.addGame(game1);
        fifa.addGame(game2);

        fifa.playNext();
        fifa.playNext();
    }
}
