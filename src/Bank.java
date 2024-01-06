import java.util.HashMap;
import java.util.Map;

public class Bank {
    public static final int maxOverdrawAmount = 120;
    public static final int minInitialDeposit = 20;
    Map<Person, CheckingAccount> customersAndAccounts = new HashMap<>();

    public void addCustomer(Person theCustomer, CheckingAccount theirAccount) {
        customersAndAccounts.put(theCustomer, theirAccount);
    }

    public void listOfCustomers(){
        System.out.println(customersAndAccounts);
    }


}


