package memes.task2;

public class Main {
    public static void main(String[] args) {
        Editor ed = new Editor();

        ed.write("a");
        ed.write("b");
        ed.write("c");

        System.out.println(ed.getVal());

        ed.undo();
        System.out.println(ed.getVal());

        ed.undo();
        System.out.println(ed.getVal());
    }
}
