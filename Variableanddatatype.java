public class Variableanddatatype{
    public static void main(String[] args) {
        //bit
        byte a=1;
        short b=2;
        int c=10;
        long d=1001;
        boolean f=true;
        double s=23.7;
        char w='c';
        float q=67.8f;
        
        
        
        System.out.println(a);
         System.out.println(b);
          System.out.println(c);
           System.out.println(d);
            System.out.println(f);
             System.out.println(s);
              System.out.println(w);
               System.out.println(q);

               int num1=50;
               int num2=6;

               System.out.println(num1% num2);
               System.out.println(num1+ num2);
               System.out.println(num1- num2);
               System.out.println(num1* num2);
               System.out.println(num1/ num2);
        //relational oprator [< > <= >= == !=]  
        System.out.println(num1< num2);
        System.out.println(num1 >num2);
        num2=10;
        System.out.println(num1>= num2); 
        System.out.println(num1<= num2);  
        System.out.println(num1!= num2);  

        //logical oprator [&& || !]

        int num=7;
        int result=num++;
        System.out.println(result);
        System.out.println(num);

    }
}