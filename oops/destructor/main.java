class demo{
    demo(){
    System.out.println("constructor is called");
    }

    @Override
    protected void finalize()throws Throwable{
        System.out.println("finalize methode is caled");
    }

    
}
public class main{
    public static void main(String[] args) {
        demo Demo=new demo();
        Demo=null;
        System.gc();
    }
}

//it is use for clenupe resorces ihis is no longer descrupted
//fialise methode that is cold by garbage colector before and object is remove from memory
//garbage collaction then automaticaly delete unused object frome memory
//whwn an object is not use any more garbaje collection remove it in memory
// when gc run 
//when jvm case memory is low
//when objects are no longer wepon