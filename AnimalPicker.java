
import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which animal would you like to see?");

        String choice = scan.nextLine();

        if(choice.toLowerCase().equals("cat")){
            System.out.println("CAT ASCII ART HERE");
        }else if(choice.toLowerCase().equals("dog")){
            System.out.println("DOG ASCII ART HERE");
        }else{
            System.out.println("Invalid Option! Enter Dog or Cat.");
        }

        
    }
}