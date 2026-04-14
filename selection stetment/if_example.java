public class if_example{
    public static void main(String[] args) {
        int age =18;
        if(age>=18){
            System.out.println("you are eligibale" );

        }else{
            System.out.println("not eligible for vote");
        }


        //else if 
        int mark=75;
        if(mark >= 90){
System.out.println("graid a");
        }else if(mark >=70){
          System.out.println("graid b");
        }else if(mark >=50){
         System.out.println("graid c");
        }else{
            System.out.println("fail");
        }
        
        
        
        
       /*  int agea=22;
        boolean haslicense =true;

        if(agea >=18){
            System.out.println("you can drive");
        }
        String result =(age >=18)? "you are eligibale":"not eligible for vote";*/
        

      int year =2026;
      boolean isleap=(year % 4==0 && year % 100!=0 )||(year %400==0);
      System.out.println(isleap ? "leap year":"not leap year");// this is the simple way to use condion stetment like if else

    }
}

//ternari operator is compact form of
//(condition)?(value is true):(value is false)
//String result =(age >=18)? "you are eligibale":"not eligible for vote";
//itestion oprator aslong asboolean condition is true
//this avoid to repited code righiting
//in java we have for loops and while loop and do while loop