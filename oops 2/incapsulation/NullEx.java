class Demo{
    int id;

    Demo(int id){
        this.id=id;
    }
}

public class NullEx {
    public static void main(String[] args) {
        Demo d1=new Demo(10);
        Demo d2=new Demo(20);

        d1=null; //d1 is now null and no longer references the object with id 10
        
        System.gc();  //requesting JVM to run Garbage Collector
        System.out.println("program is still running");  
       
    }
}
