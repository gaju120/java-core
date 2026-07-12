  class Method_type {
    public static int add(int a, double b) {
        int result = (int)(a + b);  
        return result;
    }
}

 public class Main {
    public static void main(String[] args) {
         

        int result= Method_type.add(5, 3.5);   
        System.out.println("Result = " + result);
    }
}


    
 