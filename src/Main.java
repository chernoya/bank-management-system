import java.util.Scanner;

public class Main {

    static String tempFirstName;
    static String tempMiddleName;
    static String tempLastName;

    static int tempAge;
    
    static int tempSSN;

    public static void main(String[] args) {

        /*
            a) trivia game with classes and objects

            b) Bank management system
            create a bank management system which has the following components:
            person (which saves first, middle and last name, age and a "social security number")
            bank (which saves a list of customers and their checking accounts: MAP, maximum overdraw amount)
            checking account (should have a current value, methods/functions for taking and depositing money)
            opening a checking account should only work via a bank and must require a certain amount of initial deposit

            BONUS: make the banking system interactive

            Overdraw: 

        */
        
        Scanner scanner = new Scanner(System.in);

        // user inputs
        System.out.println("Enter your first name: ");
        tempFirstName = scanner.nextLine();
        
        System.out.println("Enter your middle name: ");
        tempMiddleName = scanner.nextLine();
        
        System.out.println("Enter your last name: ");
        tempLastName = scanner.nextLine();

        System.out.println("Enter your Age: ");
        tempAge = scanner.nextInt();

        System.out.println("Enter your Social Security Number: ");
        tempSSN = scanner.nextInt();

        // object initialisation 
        Customer customer = new Customer(tempFirstName, tempMiddleName, tempLastName, tempAge, tempSSN);

        System.out.println("Your name: " + customer.name);
        System.out.println("Your Age: " + customer.age);
        System.out.println("Your Social Security Number: " + customer.socialSecurityNumber);
        // idk what this prints tbh

        customer.setName("Joe", "Mama", "Gay");

        System.out.println("Your new* name: " + customer.name);
        // joe mama gay

    }
}