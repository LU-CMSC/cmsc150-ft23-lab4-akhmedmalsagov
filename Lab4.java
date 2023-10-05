import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab 4");

        System.out.print("Please enter your number: ");
        int x = scanner.nextInt();

        if ((x > 0) && (x < 10)) {
            System.out.println("It is positive single digit number.");

        } else {
            System.out.print("Number should be more than 0 and less than 10, try again. ");

        }

        

}

    
}