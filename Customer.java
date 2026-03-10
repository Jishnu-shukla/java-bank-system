import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<BankAccount> accounts = new ArrayList<>();
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void showAllAccounts() {
        System.out.println("\nAccounts for name: " + name + " (" + email+ " )");
        for(BankAccount acc : accounts) {
            acc.printStatement();
        }
    }
}
