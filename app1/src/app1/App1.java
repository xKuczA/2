package app1;
import java.util.Random;
public class App1 {
    public static void main(String[] args) {
        //Player p1 = new Player();
        //Player p2 = new Player();
        Random rand = new Random();     //obiekt losujący
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza

        Player p1 = new Player();
        
        
        //p1.setName("Adam");
        //p2.setName("Piotr");
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = p1.guess();
            System.out.println(p1.getName() +": "+ guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
}    