public class CheckingAccount extends Bank {
    private int balanceAmount;
    private Person accountHolder;
    private String accountPassword;
    private String accountUsername;

    public CheckingAccount(Person accountHolder, int initialDeposit, String userName, String password) {
        this.accountHolder = accountHolder;
        this.balanceAmount = initialDeposit;
        this.accountPassword = password;
        this.accountUsername = userName;
    }

    public float showBalance() {
        return balanceAmount;
    }

    public void holderDetails() {
        System.out.println("Name: " + accountHolder.getName());
        System.out.println("Age: " + accountHolder.getAge());
        System.out.println("Social Security Number: " + accountHolder.getSSN());
    }

    public String withdraw(int withdrawalAmount) {
        if(balanceAmount + maxOverdrawAmount < withdrawalAmount) {
            return "Insufficient funds";
        } 
        else {
            this.balanceAmount = balanceAmount - withdrawalAmount;
            return "Withdrawal Successful";
        } 
    }

    public void deposit(int depositAmount) {
        this.balanceAmount = balanceAmount + depositAmount;
    }

    public void verifyLogin(String username, String pssword){
        if(this.accountUsername==username && accountPassword==pssword){
            System.out.println("Login successful!");

        } else {
            System.out.println("Password or Username in correct!");
        }
    }
}

