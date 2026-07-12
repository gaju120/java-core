public class Main1 {
      
    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
            System.out.println("Hello World");
        }
    }

 

    public static void main(String[] args) {
        int x=10;
        fun(x);
    }
    

 

   
}
