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

        int worldWidth = 10;
        int worldHeight = 5;

        int playerXCoordinate = getRandomCoordinate(worldWidth); // täisarvuline number
        int platerYCoordinate = getRandomCoordinate(worldHeight); // castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinate = getRandomCoordinate(worldWidth);
        int dragonYCoordinate = getRandomCoordinate(worldHeight);
        char dragonSymbol = 'D';
        int orcXCoordinate = getRandomCoordinate(worldWidth);
        int orcYCoordinate = getRandomCoordinate(worldHeight);
        char orcSymbol = 'O';

        // algväärtus kuni iga tsükkel
        for (int y= 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth-1) {
                    System.out.print("|");
                } else {
                    // option + command + m
                    printCharacters(playerXCoordinate, platerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
                }
            }
        }
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }

    private static void printCharacters(int playerXCoordinate, int platerYCoordinate, char playerSymbol,
                                        int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                                        int orcXCoordinate, int orcYCoordinate, char orcSymbol, int mapY, int mapX) {
        if (playerXCoordinate == mapX && platerYCoordinate == mapY) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinate == mapX && dragonYCoordinate == mapY){
            System.out.print(dragonSymbol);
        } else if (orcXCoordinate == mapX && orcYCoordinate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}