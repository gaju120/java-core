 /*class Calculator {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class adding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        // calls int version
        System.out.println(calc.add(5.5, 10.5));    // calls double version
        System.out.println(calc.add(1, 2, 3));      // calls 3-argument version
    }
}*/

class display{
    void print(int number){
        System.out.println("integer"+ number);

    }
    void print(double number){
        System.out.println("double"+ number);
    }
    void print(String name){
        System.out.println( name);
    }
}

 class adding{
    public static void main(String[] args) {
        display p=new display();
       p.print(100);
       p.print(40.5);
       p.print("gaju");
    }
 }
