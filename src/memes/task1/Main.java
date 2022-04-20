package memes.task1;

public class Main {
    public static void main(String[] args) {
        Playstation ps = new Playstation();

        PlaystationFan psf1 = new PlaystationFan();
        PlaystationFan psf2 = new PlaystationFan();

        DarkSoulsFan dsf1 = new DarkSoulsFan();

        ps.subscribe(psf1).subscribe(psf2).subscribe(dsf1);

        ps.addGame("a");
        ps.addGame("b");
    }
}
