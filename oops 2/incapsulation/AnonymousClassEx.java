interface Greeting {
    void sayHello();
}

public class AnonymousClassEx {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        g.sayHello();
    }
}

//Anonymous classes are like “quick one-time use classes”. Instead of creating a separate file or class, you define them inline.
