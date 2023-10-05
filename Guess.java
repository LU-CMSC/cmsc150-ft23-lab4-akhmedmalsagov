import java.util.Scanner;
import java.util.Random;

public class Guess {
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; //What the heck does 100 and + 1 do? What about 101? 
        //It makes 100 inclusive while 101 is exclusive. In this line 0 is inclusive and 100 too, while 101 is exlusive.

        System.out.println("In the range from 0 to 100, try to guess my number.");   
        System.out.print("Guess and type your guessing number: ");

        int gNumber = input.nextInt();
        
        while (gNumber != number) {
            if (gNumber < number) {
                System.out.println("Your number is LOWER.");
                System.out.print("Type your guessing number: ");
                gNumber = input.nextInt();
            } else if (gNumber > number) {
                System.out.println("Your number is HIGHER.");
                System.out.print("Type your guessing number: ");
                gNumber = input.nextInt();
            } 
        }
        if ( gNumber == number) {

            System.out.println("You won, Congrats!");
        }
    }
}