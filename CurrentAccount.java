// package BankAccountManagement;

public class CurrentAccount extends BankAccount{
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double balance, double overDraftLimit){
        super(accountNumber, ownerName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withDraw(double amount) {
        if (amount <= getBalance() + overDraftLimit) {
            System.out.println(" Withdawed Amount: Rs. "+amount+" (overdraft allowed). ");
        } else{
            System.out.println("Exceeded overdraft Limit.");
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public String toString() {
        return "Current Account [" +getAccountNumber() + "] - Owner: " + getOwnerName();
    }
}