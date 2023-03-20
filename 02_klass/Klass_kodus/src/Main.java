public class Main {
    public static void main(String[] args) {
        Klass broneering1 = new Klass("Karl","12345678","12.03.23","19:30");
        Klass broneering2 = new Klass("Karl2","87654321","13.03.23","20:00");

        String sonum = broneering1.loobuBroneeringust();
        System.out.println(sonum);

        String sonum2 = broneering2.muudaBroneeringut("Karl3","21436587","10.04.23", "18:30");
        System.out.println(sonum2);
    }
}