package memes.problem2;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.doRepair("repair 1");
        service.doRepair("repair 2");
        service.doRepair("repair 3");

        service.goBack();
    }
}
