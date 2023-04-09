import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Tere!");

        double vastus = keskmineKiirus(90, 50);
        System.out.println("Kahe kilomeetrise lõigu vaheline keskmine kiirus on: ");
        System.out.println(vastus);

        double[] kiirused = {90, 50, 80, 70, 120};
        double vastus2 = keskmisedKiirused(kiirused);
        System.out.println("Kiiruste keskmine on: ");
        System.out.println(vastus2);

        Scanner scanner = new Scanner(new File("Kiirused.txt"));
        double kiirusedKokku = 0.0;
        int mituKilomeetrit = 0;
        while (scanner.hasNextDouble()) {
            kiirusedKokku += scanner.nextDouble();
            mituKilomeetrit++;
        }

        double keskmine = kiirusedKokku / mituKilomeetrit;

        PrintWriter pw = new PrintWriter("Keskmine.txt");
        pw.printf("%.2f", keskmine);
        pw.close();
    }

    public static double keskmineKiirus(double kiirus1, double kiirus2) {
        return (kiirus1 + kiirus2) / 2;
    }

    public static double keskmisedKiirused(double[] kiirused) {
        double km = kiirused.length;
        double s6iduKiirus = 0.0;
        for (double v : kiirused) {
            s6iduKiirus += v;
        }
        return s6iduKiirus / km;
    }
}