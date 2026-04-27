
    class account{
    String accountholder;
  double balance;
   




  void deposite(double amount){
    balance+=amount;
    System.out.println( "diposited"+amount+"new balance"+balance);

  }
    
}
class savingAccount extends account{
    double intrestrate;
    void applyintrest(){
        double intrest= balance * intrestrate/100;
        balance +=intrest;
        System.out.println( "intrest applied" +intrest+ "to" +accountholder+"new balance" +balance);
    }
}
   class primiumsavingaccount extends savingAccount {
      double primiumintrest;
    void applyintrest(){
        double intrest= balance * intrestrate/100;
        balance +=intrest;
        System.out.println("Bonus added: " + intrest + " to " + accountholder +
                           ", New balance: " + balance);
    }

}

public class multilevel_inheritans {
    public static void main(String[] args) {
       primiumsavingaccount obj = new primiumsavingaccount();
        obj.accountholder = "John Doe";
        obj.balance = 54000;
        obj.intrestrate = 5.0;
        obj.primiumintrest = 2;
        obj.deposit(1000);       // From Account
        obj.applyInterest();      // From SavingAccount
        obj.addBonus();           // From BonusAccount
    }
}
