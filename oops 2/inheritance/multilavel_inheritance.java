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

   double cashbackRate;

   void applyCashback(){
       double cashback = accountbalance * cashbackRate / 100;
       accountbalance += cashback;
       System.out.println("Cashback applied: " + cashback+" New balance: " + accountbalance);
   }
}


public class multilavel_inheritance {
    public static void main(String[] args) {
        PremiumSavingsAccount psa = new PremiumSavingsAccount(); // this process is constructor:new PremiumSavingsAccount();
        psa.accountholdername = "gajanan";
        psa.accountbalance = 2000.0;
        psa.interestRate = 4.0;
        psa.cashbackRate = 2.0;
        psa.deposit(1000.0);
        psa.applyInterest();
        psa.applyCashback();
        System.out.println("Final balance: " + psa.accountbalance);
        
    }
}
