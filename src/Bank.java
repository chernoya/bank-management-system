import java.util.HashMap;

public class Bank {
    
    public static final int maxOverdraw = 100;
    public static final int minDeposit = 10;

    public HashMap<Customer, Account> customers = new HashMap<Customer, Account>();
}

// account class? 