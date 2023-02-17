import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        //System.out.println(input);
        World world =  new World(10,5);
        //System.out.println(input);

        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinate, player.yCoordinate, player.symbol,
                dragon.xCoordinate, dragon.yCoordinate, dragon.symbol,
                orc.xCoordinate, orc.yCoordinate, orc.symbol);
        String input = scanner.nextLine();

        // for (; !input.equals("end"); )
        while(!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height, player.xCoordinate, player.yCoordinate, player.symbol, dragon.xCoordinate, dragon.yCoordinate, dragon.symbol, orc.xCoordinate, orc.yCoordinate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }

    //Random rand = new Random(); // uus instants
    //Math.random(): // static
}