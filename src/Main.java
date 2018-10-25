import java.util.*;

public class Main {
    public static void main(String[] args) {
        // init cities
        GilgCity[] city = new GilgCity[2];
        city[0] = new GilgCity();
        city[1] = new GilgCity();
        int player = 0;
        boolean[] end = new boolean[1];
        end[0] = false;
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine() && !end[0]) {
            parseLine(input.nextLine(), player, city, end);
            System.out.println(end[0]);
        }
    }


    public static void parseLine(String line, int player, GilgCity[] city, boolean[] end) {
        int addHome;
        int blockId = 0;
        int floor;
        int unit;
        int unitId;
        try {
            String[] words = line.split(" ");
            if (line.toLowerCase().contains("add")) {
                if (line.toLowerCase().contains("block")) {
                    blockId = Integer.parseInt(words[2]);
                }
                if (line.toLowerCase().contains("bazaar")) {
                    blockId = Integer.parseInt(words[2]);
                }
                if (line.toLowerCase().contains("army")) {
                    blockId = Integer.parseInt(words[2]);
                }
                if (line.toLowerCase().contains("defense")) {
                    blockId = Integer.parseInt(words[2]);
                }
                if (line.toLowerCase().contains("home")) {
                    blockId = Integer.parseInt(words[2]);
                    floor = Integer.parseInt(words[3]);
                    unit = Integer.parseInt(words[4]);
                }
            }
            if (line.toLowerCase().contains("remove")) {
                blockId = Integer.parseInt(words[1]);
                unitId = Integer.parseInt(words[2]);
            }
            if (line.toLowerCase().contains("upgrade")) {
                blockId = Integer.parseInt(words[1]);
                unitId = Integer.parseInt(words[2]);
            }
            if (line.toLowerCase().contains("see score")) {
                System.out.println(city[player].getPoint());
            }
            if (line.toLowerCase().contains("see gills")) {
                System.out.println(city[player].getWealth());
            }
            if (line.toLowerCase().contains("done")) {
                player = -1 * (player - 1);
            }
            if (line.toLowerCase().contains("yield")) {
                end[0] = true;
            }
            if (line.toLowerCase().contains("attack")) {
                blockId = Integer.parseInt(words[1]);
            }
            if (line.toLowerCase().contains("loot")) {
                blockId = Integer.parseInt(words[1]);
            }
        }
        catch (Exception ex){
            System.out.println("not possible");
        }
//        System.out.println(blockId);
    }
}
