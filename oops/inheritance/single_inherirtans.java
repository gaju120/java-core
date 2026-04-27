class account{
    String accountholder;
  double balance;


  void deposite(double amount){
    balance+=amount;
    System.out.println( "diposited"+amount+"new balance"+balance);

  }
    
}
class savingaccount extends account{
    double intrestrate;
    void applyintrest(){
        double intrest= balance * intrestrate/100;
        balance +=intrest;
        System.out.println( "intrest applied" +intrest+ "to" +accountholder+"new balance" +balance);
    }
}



public class single_inherirtans {
    public static void main(String[] args) {
        savingaccount obj=new savingaccount();
        obj.accountholder = "John Doe";
        obj.balance = 54000;
        obj.intrestrate = 5.0;
        obj.deposit(500.0);       // Works now
        obj.applyInterest();


        
    }
    
}
