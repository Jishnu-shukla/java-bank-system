// package BankAccountManagement;

public abstract class BankAccount implements InterestBearing{
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("\nDeposited Amount: Rs. "+amount+ " New Balance: Rs. " + balance );
        } else{
            System.out.println("Invalid Amount");
        }
    }

    public void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawed: Rs. "+amount+" New Balance: Rs. " + balance + "\n");
        } else{
            System.out.println("Invalid Amount");
        }
    }

    public void printStatement() {
        System.out.println("--------Account Statement--------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance );
        System.out.println("Interest: "+ calculateInterest());
        System.out.println("----------------------------------");
    }
}