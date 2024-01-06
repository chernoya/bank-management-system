import java.util.*;

public class Main {
    
    // testing variables
    public Person person1;
    public Person person2;
    public Person person3;

    public static CheckingAccount account1;
    public CheckingAccount account2;
    public CheckingAccount account3;

    public static String tempUserName;
    public static String tempPassword;

    public static String tempFirstName;
    public static String tempMiddleName;
    public static String tempLastName;

    public static int tempSSN;
    public static int tempAge;

    public static int tempDeposit;

    Bank jewBank = new Bank();

    public static void main(String[] args) {
        
        bankSystem();
        
    }

    public static void bankSystem() {

        int answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank! ");

        while(true) {
            answer = 0;
            System.out.println("What would you like to do? \n Login [1] \n Create new Account [2] \n Quit [3]");

            // tests whether input is valid or not
            try {
                answer = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error, Input format is invalid");
                answer = 0;
            }
            
            // goes through each displayed option
            switch(answer) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("You must choose a valid option! ");

            }
        }

    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        tempUserName = scanner.nextLine();
        System.out.println("Enter your password: ");
        tempPassword = scanner.nextLine();

        account1.verifyLogin(tempUserName, tempPassword);
    }

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name: ");
        tempFirstName = scanner.nextLine();
        System.out.println("What is your middle name: ");
        tempMiddleName = scanner.nextLine();
        System.out.println("What is your last name: ");
        tempLastName = scanner.nextLine();

        System.out.println("How old are you: ");
        tempAge = scanner.nextInt();

        System.out.println("What is your social security number: ");
        tempSSN = scanner.nextInt();

        System.out.println("Choose a unique username: ");
        tempUserName = scanner.nextLine();

        System.out.println("Choose a unique password: ");
        tempPassword = scanner.nextLine();
        
        Person person1 = new Person(tempFirstName, tempMiddleName, tempLastName, tempAge, tempSSN);

        System.out.println("How much would you like to deposit: ");
        tempDeposit = scanner.nextInt();

        CheckingAccount account1 = new CheckingAccount(person1, tempDeposit, tempUserName, tempPassword);

        System.out.println("Congratulations, you've created a bank account!");

    }
}