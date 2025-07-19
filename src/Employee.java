 public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class Employee extends Person {
    String employeeID;
    double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Ravi Kumar", 28, "EMP001", 45000.0);
        emp.displayEmployee();
    }
}