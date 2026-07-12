 class Bank {
    String Name;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank acc = new Bank();
        acc.Name = "Gajanan";
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.deposit(500);   // balance = 1500
        acc.withdraw(300);  // balance = 1200
       System.out.println("Final Balance = " + acc.getBalance());
    }
}
