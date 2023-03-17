public class Main {
    public static void main(String[] args) {
        System.out.println("Tere!");
        double vastus = keskmineKiirus(90, 50);
        System.out.println("Kahe kilomeetrise lõigu vaheline keskmine kiirus on: ");
        System.out.println(vastus);
    }
    public static double keskmineKiirus(double kiirus1, double kiirus2) {
        double keskmineKiirus = (kiirus1 + kiirus2) / 2;
        return keskmineKiirus;
    }
}