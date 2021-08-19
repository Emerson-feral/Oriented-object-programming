import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        
        System.out.println("Enter your Last name: ");
        String lastName = input.next();

        System.out.println("Welcome " + firstName + " " + lastName);

    }
}
