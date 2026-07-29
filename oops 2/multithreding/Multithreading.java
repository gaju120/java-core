class task1 extends Thread{
    public void run(){
        System.out.println("thred  1 is running");
    }
 }
 class task2 extends Thread{
    public void run(){
        System.out.println("thred  2 is running");
    }
 }
 class task3 extends Thread{
    public void run(){
        System.out.println("thred  3 is running");
    }
 }
 
public class Multithreading {
    public static void main(String[] args) {
       task1 t1=new task1();
       task2 t2=new task2();
       task3 t3= new task3(); 

       t1.start();
       System.out.println(t1.getName());

       t2.start();
       System.out.println(t2.getName());

       t3.start();
       System.out.println(t3.getName());
    }
}
