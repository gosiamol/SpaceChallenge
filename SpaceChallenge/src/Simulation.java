import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceOctetStreamData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*PART 2: The simulation
Create a Simulation class that is responsible for reading item data and filling up the rockets.
The Simulation class should include these methods:



loadU2: this method also takes the ArrayList of Items and starts creating U2 rockets and filling them with those items the same way as with U1 until all items are loaded. The method then returns the ArrayList of those U2 rockets that are fully loaded.
runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each of the rockets in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again. All while keeping track of the total budget required to send each rocket safely to Mars. runSimulation then returns the total budget required to send all rockets (including the crashed ones).
*/
public class Simulation {
    private ArrayList<Item> items;
    private File phase1 = new File("phase-1.txt");
    private File phase2 = new File("phase-2.txt");
    private ArrayList<Rocket> rocketU1;
    private ArrayList<Rocket> rocketU2;

    public ArrayList<Item> loadItems (int phase) throws FileNotFoundException {
        if(phase ==1 ){
            loadItems(phase1);
        }else{
            loadItems(phase2);
        }

        return items;
    }

    private void loadItems(File file) throws FileNotFoundException {
        items = new ArrayList<>();
        // wczytujemy z pliku linia po lini dane
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String stringLine = scanner.nextLine();
            //wczytaną linie dzielimy na 2 częsci przed i po =
            String [] stringLineSeparatorEqual = stringLine.split("=");
            Item item = new Item(stringLineSeparatorEqual[0],Integer.parseInt(stringLineSeparatorEqual[1]));
            items.add(item);
        }
    }
    /*loadU1: this method takes the ArrayList of Items
returned from loadItems and starts creating U1 rockets.
It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object
 and filling that one until all items are loaded.
 The method then returns the ArrayList of those U1 rockets that are fully loaded.*/
    public ArrayList<Rocket> loadU1 (ArrayList<Item> itemsU1){
        rocketU1 = new ArrayList<>();
        return rocketU1;
    }
}
