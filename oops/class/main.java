public class main {

    public static void main(String[]args){
        employee object=new employee();
         employee pratik=new employee();


        System.out.println(object.id);
        System.out.println(object.name);
        System.out.println(object.salary);

        object.id=11;
        object.name="gaju";
        object.salary=40000;

        //

        pratik.id=12;
        pratik.name="pratik";
        pratik.salary=50000;

        object.printdetails();
        pratik.printdetails();


       

    }
}

class employee{
    int id;
    String name;
    float salary;

    public void printdetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }
}

//an object can not exit but class exit any object
//becuse class is compiled form concept stord in meta data 