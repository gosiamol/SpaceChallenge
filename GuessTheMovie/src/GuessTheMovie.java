/*

 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class GuessTheMovie  {

    public static void main(String[] args)throws Exception{
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);

        // do tablicy wrzucamy wszystkie tytuły z pliku movies.txt
        ArrayList<String> movies;
        movies = new ArrayList<>();

        while (scanner.hasNextLine()) {
            movies.add(scanner.nextLine());
        }

        // losujemy jeden tytul od 1 do 25 = movies.size()
        int randomNumber = (int) (Math.random()*movies.size()) ;
        String randomMovies = movies.get(randomNumber);
        String rightLetters ="";
        String wrongLetters ="";
        int countLost=0;


        //jest 10 prób niezgadniecia litery
        while(countLost<10){
            //wyświetlamy podkreślenia "_" w miejsce prawdziwych liter tym samym podając liczbę liter
            if ( rightLetters.equals("") ) {
                System.out.println("Zgadujesz: "+randomMovies.replaceAll("[a-zA-Z]","_"));
            }
            else  {
                System.out.println("Zgadujesz: "+randomMovies.replaceAll("[a-zA-Z&&[^" + rightLetters + "]]" , "_"));
            }
            //pobieramy literę
            System.out.println("Zgadnij literę: ");
            Scanner scaner = new Scanner(System.in);
            String letter = scaner.next().toLowerCase();
            //czy wybrana litera jest prawidłowa
            if (randomMovies.toLowerCase().contains(letter)){
                rightLetters =rightLetters.concat(letter).concat(letter.toUpperCase());
            }
            else{
                countLost++;
                wrongLetters = wrongLetters.concat(" ").concat(letter);
            }
            //wyswietamy nieprawidłowe litery które zostały wybrane
            System.out.println("Zgadłeś nieprawidłowe ("+countLost+") litery. Twoje złe litery:"+wrongLetters);

            // sprawdzamy czy wygrana
            if (rightLetters.length()>0) {

                if (!randomMovies.replaceAll("[a-zA-Z&&[^" + rightLetters + "]]", "_").contains("_")) {
                    System.out.println("Wygrałes!");
                    System.out.println("Odgadnięty tytuł: "+randomMovies);
                    return;
                }
            }
        }
        System.out.println(("Przegrałeś!"));
    }

}
