public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // risky code
            System.out.println("Result: " + result);
        }catch(Exception e){
            System.out.println(ex.getMessage());
        }finally{
         System.out.println("program is in finally  block");
        }
        System.out.println("program is running");
    }
}

