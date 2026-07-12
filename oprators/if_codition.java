public class if_codition {
    
    public static void main(String[] args) {
        
        // int age =5;
        // if(age>=18){
        //     System.out.println("you are adult");
        // }else if(age >=16&&age<18){
        //     System.out.println("you are a minor");
        // }else{
        //     System.out.println("you are not adult");
        // }

        int percent = 72;  

        if(percent >= 75) {
            System.out.println("Distinction");
        } else if(percent >= 60 && percent < 75) {
              System.out.println("First Class");
        } else if(percent >= 50 && percent < 60) {
               System.out.println("Second Class");
        } else if(percent >= 35 && percent < 50) {
            System.out.println("Pass Class");
          } else {
            System.out.println("Fail");
        }

        int age =25;
        String result =(age>= 18) ?"adult" :"minor";
        System.out.println(result);
    }
}
