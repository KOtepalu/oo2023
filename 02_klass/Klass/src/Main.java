import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kasutaja karl = new Kasutaja("Karl", "Karl", "Karl", "Karl", "Karl");

        Kasutaja karl2 = new Kasutaja("Karl", "Karl", "Karl", "Karl", "Karl");

        Kasutaja karl3 = new Kasutaja("Karl", "Karl", "Karl", "Karl", "Karl");

        String sonum = karl.kustutaKasutaja();
        System.out.println(sonum);

        karl3.muudaParool("KarlKarl");

        Tellimus tellimus1 = new Tellimus("Karl", Arrays.asList("Coca", "Fanta"));
        Tellimus tellimus2 = new Tellimus("Karl", Arrays.asList("Coca", "Fanta"));
        Tellimus tellimus3 = new Tellimus("Karl", Arrays.asList("Coca", "Fanta"));

        tellimus1.muudaMakstuks();
        tellimus2.muudaMakstuks();

        // KODUS: 1 klass, constructor, 2+ muutujat, 2+ funktsiooni, 2+ väljakutset mainis.
    }
}