public class Orc {
    int xCoordinate; // täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    // constructor
    public Orc(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'O';
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
