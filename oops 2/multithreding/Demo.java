 class myThread extends Thread{
    public void run(){
        System.out.println("thred is running");
    }
 }
 
 
 public class Demo{
    public static void main(String[] args) {
       myThread a1=new myThread();
       
       a1.start();

       Thread t = new Thread("fct");
       System.out.println(t.getName());
    }
 }