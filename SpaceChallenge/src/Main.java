
/*

PART 3: Running the Simulation
Create a Main class with the main method and start running the simulation:

Create a Simulation object
Load Items for Phase-1 and Phase-2
Load a fleet of U1 rockets for Phase-1 and then for Phase-2
Run the simulation using the fleet of U1 rockets and display the total budget required.
Repeat the same for U2 rockets and display the total budget for that.*/

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        int phase1 = 1;
        int phase2 = 2;
        ArrayList<Item> phase1Item;
        ArrayList<Item> phase2Item;

        //obiekt simultion
        Simulation simulation = new Simulation();

        //załaduj przedmioty fazy 1 i fazy 2 do tablic
        phase1Item = simulation.loadItems(phase1);
        phase2Item = simulation.loadItems(phase2);

        //załaduj do rakiety U1 fazę 1, oraz do rakiety u2 faze 2


        //uruchamia symulację przy uzyciu floty takiet U1 i wyświetla wymagany całkowicie budżet

        //uruchamia symulację przy uzyciu floty takiet U2 i wyświetla wymagany całkowicie budżet
    }
}
