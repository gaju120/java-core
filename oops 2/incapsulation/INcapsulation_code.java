class Bankaccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public Bankaccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;                              //constructor is used to initialize the account number and initial balance of the bank account. The 'this' keyword is used to refer to the cu
       this.balance = initialBalance;      //this are use current object reffrence
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
       balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
class INcapsulation_code {
    public static void main(String[] args) {
        // Create a new bank account
        Bankaccount account = new Bankaccount("123456789", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}