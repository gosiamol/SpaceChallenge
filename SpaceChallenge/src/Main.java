
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
        String phase1 = "phase-1.txt";
        String phase2 = "phase-2.txt";

        ArrayList<Item> phase1Item;
        ArrayList<Item> phase2Item;
        int u1Cost;
        int u2Cost;

        //obiekt simultion
        Simulation simulation = new Simulation();

        //załaduj przedmioty fazy 1 i fazy 2 do tablic
        phase1Item = simulation.loadItems(phase1);
        phase2Item = simulation.loadItems(phase2);

        //uruchamia symulację przy uzyciu floty takiet U1 i wyświetla wymagany całkowicie budżet
        u1Cost = simulation.runSimulation(simulation.loadU1(phase1Item));
        u1Cost +=simulation.runSimulation(simulation.loadU1(phase2Item));
        System.out.println("Całkowity koszt dla rakiet typu U1: " +u1Cost+" milionów dolarów");

        //uruchamia symulację przy uzyciu floty takiet U2 i wyświetla wymagany całkowicie budżet
        u2Cost = simulation.runSimulation(simulation.loadU2(phase1Item));
        u2Cost +=simulation.runSimulation(simulation.loadU2(phase2Item));
        System.out.println("Całkowity koszt dla rakiet typu U2: " +u2Cost+" milionów dolarów");

    }
}
