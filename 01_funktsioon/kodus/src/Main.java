import java.util.Random;
public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");

        printForLoop(5);
        printForLoop(10);

        String hinnang = temperatuuriHinnang(-2.5);
        String hinnang2 = temperatuuriHinnang(5.7);
        System.out.println(hinnang);
        System.out.println(hinnang2);

        double summa = arvutaTaksoMaksumus(3);
        System.out.println(summa);
        double summa2 = arvutaTaksoMaksumus(4.5);
        System.out.println(summa2); */

        double lend = lennuPikkus(3.5,2.5, 1.5);
        System.out.println(lend);
        double lend2 = lennuPikkus(1.5, 4.5, 0.5);
        System.out.println(lend2);

        String pusa = pusaV2rv(Math.random()*10);
        System.out.println(pusa);
        String pusa2 = pusaV2rv(Math.random()*10);
        System.out.println(pusa2);

        String kaart = suvalineKaart();
        System.out.println(kaart);
        String kaart2 = suvalineKaart();
        System.out.println(kaart2);

    }

    private static double lennuPikkus(double yksLend, double teineLend, double ymberIstumine) {
        return yksLend+teineLend+ymberIstumine;
    }

    private static String pusaV2rv(double juhus) {
        if (juhus <= 3){
            return "hall pusa";
        } else if (juhus >= 7) {
            return "valge pusa";
        } else {
            return "must pusa";
        }
    }

    private static String suvalineKaart() {
        String[] mastid = {"Ärtu", "Ruutu", "Risti", "Poti"};
        String[] kaardid = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "poiss", "emand", "kuningas", "A" };
        Random random = new Random();
        return (mastid[random.nextInt(mastid.length)] + " " + kaardid[random.nextInt(kaardid.length)]);
    }

    /*private static double arvutaTaksoMaksumus(double tunnid) {
        return 3+0.8*tunnid;
    }

    private static String temperatuuriHinnang(double temp) {
        if (temp < 0) {
            return "On jääs";
        } else {
            return "On vesi";
        }
    }

    private static void printForLoop(int kordadeArv) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    } */
}