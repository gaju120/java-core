// class Mytask extends Thread {
//     public void run() {
//         for (int i = 1; i <= 3; i++) {

//             System.out.println(Thread.currentThread().getName() + "running");
//         }
//     }
// }

// public class Multithreding_interface {

//     public static void main(String[] args) {

//         Mytask task = new Mytask();
//         Thread t1=new Thread();
//         task.start();
//         task2.start();
//     }
// }

class Mytask implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {

            System.out.println(Thread.currentThread().getName() + "running");
        }
    }
}

public class Multithreding_interface {

    public static void main(String[] args) {

        Mytask task = new Mytask();
        Thread t1=new Thread(task,"Emp-1");
        Thread t2=new Thread(task,"emp-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        //usualy higher priority run first but 

        t1.start();
        t2.start();
    }
}

