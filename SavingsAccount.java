// package BankAccountManagement;

public class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; //4% per year

    public SavingsAccount (String accountNumber, String owenerName, double balance) {
        super(accountNumber, owenerName, balance);
    }   

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public String toString() {
        return "Saving Account [" + getAccountNumber() + "] - Owner: " + getOwnerName(); 
    } 
}