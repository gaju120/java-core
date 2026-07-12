class Account{
    String accountholdername;
    double accountbalance;

void deposit(double amount){
    accountbalance += amount;
    System.out.println("Deposited: " + amount + " New balance: " + accountbalance);
}

}

//derived class
class SavingsAccount extends Account{
    double interestRate;

    void applyInterest(){
       double interest = accountbalance * interestRate / 100;
       accountbalance += interest;
       System.out.println("Interest applied: " + interest+" New balance: " + accountbalance);
    }
}

class PremiumSavingsAccount extends SavingsAccount{

}


public class single_inheritance{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountholdername = "John Doe";
        sa.accountbalance = 1000.0;
        sa.interestRate = 5.0;
        sa.deposit(500.0);
        sa.applyInterest();
        System.out.println("Final balance: " + sa.accountbalance);
    }
}