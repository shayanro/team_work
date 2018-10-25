import java.util.*;

public class Main {
    public static void main(String[] args){
        // init cities
        GilgCity[] city = new GilgCity[2];
        city[0].init();
        city[1].init();
        int done = 0;
        int yeild = 0;
        int player = 0;
        boolean end = false;
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()){
            parseLine(input.nextLine(), player, city, end);
        }
    }

    public static void parseLine(String line, int player, GilgCity[] city, boolean end){
        if (line.toLowerCase().contains("add")){

        }
        if (line.toLowerCase().contains("remove")){

        }
        if (line.toLowerCase().contains("upgrade")){

        }
        if (line.toLowerCase().contains("see score")){
            System.out.println(city[player].getPoint());
        }
        if (line.toLowerCase().contains("see gills")){
            System.out.println(city[player].getWealth());
        }
        if (line.toLowerCase().contains("done")){
            player = !player;
        }
        if (line.toLowerCase().contains("yield")){
            end = true;
        }
    }
}
