import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        Scanner scannum = new Scanner(System.in);

        // Declare Random object
        Random rand = new Random();
        char[] habitat_store;
        char[] animal_store;

        //storing habitats and animals
        ArrayList<String> habitats = new ArrayList(15);
        ArrayList<String> animals = new ArrayList(15);
        Collections.addAll(habitats, "forest", "wetland", "river", "mountain", "prairie","blank");
        Collections.addAll(animals, "foxes", "elks", "salmon", "bears", "hawks");


        int randomIndex = rand.nextInt(habitats.size());
        System.out.println(habitats.get(randomIndex));
        rand.nextInt(animals.size());

        System.out.println(animals.get(randomIndex));


        ArrayList<String> name = new ArrayList<>();
        System.out.println("enter a number of players, 4 max.");
        int numberOfPlayers = scannum.nextInt();
        int total_Tiles = numberOfPlayers*20+3 ;

        System.out.println("input a name");
        for (int i = 0; i < numberOfPlayers; i++) {
            name.add(scan.nextLine());
        }

        Collections.shuffle(name);
        System.out.println("Player names: " +name);
    }

}

class Players{
    int numberOfPlayers;
    String[] playerName;
    int playerScore =0;
    int playerTurnNo =1;
}
class Habitat{
    String[] habitat;
}

class Animal{
    String[] animal;
}