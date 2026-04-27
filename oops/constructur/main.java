class employee{
    String name;
    double salary;

    employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        System.out.println("constructur exicuted");

    }
     employee(employee other) {
        this.name = other.name;
        this.salary = other.salary;

     }

       
    
    void displaydetail(){
        System.out.println("employee name" +name+ "salary" +salary);
    } 
}

public class main{


    public static void main(String[] args) {
        employee emp1 = new employee( "gajanan", 5000);
        emp1.displaydetail();

         employee emp2 = new employee(emp1);
         emp2.displaydetail();


        System.out.println("end code");
    }
}