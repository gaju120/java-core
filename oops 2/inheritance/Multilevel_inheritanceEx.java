class person{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class employee extends person{
    double salary;

    void showSalary(){
        System.out.println("Salary: " + salary);
    }
}

class department extends employee{
    String departmentName;

    void showDepartment(){
        System.out.println("Department: " + departmentName);
    }
}


public class Multilevel_inheritanceEx {
    public static void main(String[] args) {
        department dept = new department();
        dept.name = "John Doe";
        dept.age = 30;
        dept.salary = 50000.0;
        dept.departmentName = "IT";

         dept.displayInfo();
         dept.showSalary();
         dept.showDepartment();

    }
}
