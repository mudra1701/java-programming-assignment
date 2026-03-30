class Outer {
    //  Member Inner Class
    class MemberInner {
        void show() {
            System.out.println("This is Member Inner Class");
        }
    }
    void display() {
        //  Local Inner Class
        class LocalInner {
            void show() {
                System.out.println("This is Local Inner Class");
            }
        }
        LocalInner l = new LocalInner();
        l.show();
    }
}
interface Demo {
    void show();
}
public class Program7 {
    public static void main(String[] args) {
       Outer obj = new Outer();
                Outer.MemberInner m = obj.new MemberInner();
        m.show();
             obj.display(); 
        Demo d = new Demo() {
            public void show() {
                System.out.println("This is Anonymous Inner Class");
            }
        };
        d.show();
    }
}
 

8.Create custom exception handling for bank withdrawal scenario

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
