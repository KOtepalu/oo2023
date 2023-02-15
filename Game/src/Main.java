public class Main {

    // fori
    // sout
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // String sonaline = "Suvaline tekstiline muutuja";
        // char taheline = 's'; // üks täht
        // double komakohaga = 4213.2312312;
        // float komakogaga2 = 313.123213F; // floati väga ei kasutada javas, pigem kasutatakse double
        // boolean  kagendV22rtus = true; // 0 ja 1    "y"  "n"
        // byte pisikeNumber = 100;
        // short lyhikeNumber = 312;
        // long pikkNumber = 312321331;

        int playerXCoordinate =  3; // täisarvuline number
        int platerYCoordinate = 3;
        int dragonXCoordinate = 6;
        int dragonYCoordinate = 2;
        int orcXCoordinate = 5;
        int orcYCoordinate = 1;

        // algväärtus kuni iga tsükkel
        for (int y= 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinate == x && platerYCoordinate == y) {
                        System.out.print("X");
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y){
                        System.out.print("D");
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}