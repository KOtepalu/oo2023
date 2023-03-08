public class Main {
    public static void main(String[] args) {

        Info info = new Info("BMW", 220, 50650, "automaat");
        AutoRent autoRent1 = new AutoRent(info,4);
        autoRent1.pikendaRenti(2);

        Info info2 = new Info("Fiat", 140, 95020, "manuaal");
        AutoRent autoRent2 = new AutoRent(info2,12);
        autoRent2.lisaInfo(info);

        info2.muudaHinda(150);
        System.out.println(info2.kuvaTyyp());
    }
}