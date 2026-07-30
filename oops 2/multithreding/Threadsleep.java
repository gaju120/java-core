class Mytask implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {

            System.out.println(Thread.currentThread().getName() + "running");
        }
    }
}

public class Threadsleep {
    public static void main(String[] args) {
        try {
            System.out.println("program start");
            Thread.sleep(5000);
            System.out.println("program resume after 3 sec");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
