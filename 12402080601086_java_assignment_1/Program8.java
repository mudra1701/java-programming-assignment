// Custom Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with exception
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main class
public class Program8 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);

        try {
            acc.withdraw(1500); // trying to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            acc.withdraw(500); // valid withdrawal
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

