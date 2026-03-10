import java.util.*;

public class Main {
    public static void main(String args[]) {

        // System.out.println("This is the first change");

        Scanner sc = new Scanner(System.in);
        BankAccount current = null;
        BankAccount savings = null;

        //Creates customer
        System.out.print("Enter the name of Customer: ");
        String name = sc.next();
        System.out.print("\nEnter the customer's email id: ");
        String email = sc.next();
        Customer customer = new Customer(name, email);

        //Creates accounts
        System.out.print("\nChoose the type of account to create: \n 1. Saving Account \n 2. Current Account");
        System.out.print("\nEnter your choice: ");
        int type = sc.nextInt();

        if(type == 1) {
            System.out.println("---------Enter the account details--------");
            System.out.print("Enter the account Number: ");
            String accNum = sc.next();
            System.out.print("\nEnter owner name: ");
            String ownNam = sc.next();
            System.out.print("\nEnter the balance amount: ");
            double bal = sc.nextDouble();
            savings = new SavingsAccount(accNum, ownNam, bal);
            customer.addAccount(savings);
            System.out.println("===========Your SAVINGS ACCOUNT is successfully created!!===========");
        } else if (type == 2) {
            System.out.println("---------Enter the account details--------");
            System.out.print("\nEnter the account Number: ");
            String accNum = sc.next();
            System.out.print("\nEnter owner name: ");
            String ownNam = sc.next();
            System.out.print("\nEnter the balance amount: ");
            double bal = sc.nextDouble();
            System.out.print("\nEnter the over draft amount: ");
            double ovrdr = sc.nextDouble();
            current = new CurrentAccount(accNum, ownNam, bal, ovrdr);
            customer.addAccount(current);
            System.out.println("===========Your CURRENT ACCOUNT is successfully created!!===========");
        } else{
            System.out.print("\nEnter the valid choice (1/2)");
        }

        sc.close();

        customer.showAllAccounts();
    }
}