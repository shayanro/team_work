import java.util.*;

public class Main {
    public static void main(String[] args){
        // init cities
        GilgCity[] city = new GilgCity[2];
        city[0].init();
        city[1].init();
        boolean done = false;
        boolean yeild = false;
        boolean player = false;
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()){
            parseLine(input.nextLine(), player, city);
        }
    }

    public static void parseLine(String line, boolean player, GilgCity[] city){
        if (line.toLowerCase().contains("add")){

        }
        if (line.toLowerCase().contains("remove")){

        }
        if (line.toLowerCase().contains("upgrade")){

        }
        if (line.toLowerCase().contains("see score")){
            System.out.println(city[player]);
        }
    }
}
