/*
Create a Simulation class that is responsible for reading item data and filling up the rockets.
The Simulation class should include these methods:

loadItems: this method loads all items from a text file and returns an ArrayList of Items:
    Each line in the text file consists of the item name followed by = then its weigh in kg. For example:
    habitat=100000
    colony=50000
    food=50000
    loadItems should read the text file line by line and
    create an Item object for each and then add it to an ArrayList of Items.
    The method should then return that ArrayList.
loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets.
    It first tries to fill up 1 rocket with as many items as possible
    before creating a new rocket object and filling that one until all items are loaded.
    The method then returns the ArrayList of those U1 rockets that are fully loaded.
loadU2: this method also takes the ArrayList of Items and starts creating U2 rockets and
    filling them with those items the same way as with U1 until all items are loaded.
    The method then returns the ArrayList of those U2 rockets that are fully loaded.
runSimulation: this method takes an ArrayList of Rockets and calls launch and
    land methods for each of the rockets in the ArrayList.
    Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again.
    All while keeping track of the total budget required to send each rocket safely to Mars.
    runSimulation then returns the total budget required to send all rockets (including the crashed ones).
*/

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    public Simulation(){

    }

    public ArrayList<Item> loadItems (String fileName) throws FileNotFoundException {
       File file = new File(fileName);
       ArrayList<Item> items = new ArrayList<>();
        // wczytujemy z pliku linia po lini dane
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String stringLine = scanner.nextLine();
            //wczytaną linie dzielimy na 2 częsci przed i po =
            String [] stringLineSeparatorEqual = stringLine.split("=");
            Item item = new Item(stringLineSeparatorEqual[0],Integer.parseInt(stringLineSeparatorEqual[1]));
            items.add(item);
        }
        return items;
    }

    public ArrayList<Rocket> loadU1 (ArrayList<Item> itemsU1){
        ArrayList<Rocket> rocketU1 = new ArrayList<>();
        Rocket rocket = new U1();
         for (Item item :itemsU1){
             while(!rocket.canCarry(item)){
                 rocketU1.add(rocket);
                 rocket = new U1();
             }
            rocket.carry(item);
         }
         rocketU1.add(rocket);
    return rocketU1;
    }

    public ArrayList<Rocket> loadU2 (ArrayList<Item> itemsU2){
        ArrayList<Rocket> rocketU2 = new ArrayList<>();
        Rocket rocket = new U2();
        for (Item item :itemsU2){
            while(!rocket.canCarry(item)){
                rocketU2.add(rocket);
                rocket = new U2();
            }
            rocket.carry(item);
        }
        rocketU2.add(rocket);
        return rocketU2;
    }
    public int runSimulation(ArrayList<Rocket> rockets){
        int countFailed = 0;

        for (Rocket rocket :rockets){
            while(!rocket.launch()){
                rocket.launch();
                countFailed++;
            }
            while (!rocket.land()){
                rocket.land();
                countFailed++;
            }
        }
        return rockets.get(0).cost*(rockets.size() +countFailed);
    }
}
