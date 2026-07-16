public class return_example {
   /*  public static void cheaknumber(int num) {
        if(num < 0){
            System.out.println("negative number");
            return;
        }
        System.out.println("positive number");
    }
               public static void main(String[] args) {
        cheaknumber(-55);*/
       
         public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } 
            return n * factorial(n - 1); // Recursive call
        
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}



    
    

        
    

            
    
        
    

