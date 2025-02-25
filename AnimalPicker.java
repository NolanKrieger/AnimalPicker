
import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which animal would you like to see?");

        String choice = scan.nextLine();

        while (true) { 
            if(choice.toLowerCase().equals("cat")){
                System.out.println("CAT ASCII ART HERE");
                break;
            }else if(choice.toLowerCase().equals("dog")){
                System.out.println("DOG ASCII ART HERE");
                break;
            }else{
                System.out.println("Invalid Option! Enter Dog or Cat.");
                choice = scan.nextLine();
            }
        }

        

        
    }
}