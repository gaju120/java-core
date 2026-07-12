class calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }

    
}

public class compile_timepolyEx {
   
    public static void main(String[] args) {

        calculator calc = new calculator();
        
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of integers: " + sum1);
        
        double sum2 = calc.add(5.5, 10.5);
        System.out.println("Sum of doubles: " + sum2);
        
        double sum3 = calc.add(5, 10.5);
        System.out.println("Sum of integer and double: " + sum3);
    }
}
