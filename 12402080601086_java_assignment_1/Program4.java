import java.util.*;

class BankAccount {
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Balance inquiry
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Program4 {
   
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initial = sc.nextDouble();

        BankAccount acc = new BankAccount(initial);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
