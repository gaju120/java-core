class outer {

    void show() {
        class inner {
            int b = 20;

            void display() {
                
                System.out.println("b=" + b);
            }

        }
        inner in = new inner();
        in.display();
    }
}    

public class InnerClassesEX {
    public static void main(String[] args) {
        outer out = new outer();
        out.show();
    }
}
