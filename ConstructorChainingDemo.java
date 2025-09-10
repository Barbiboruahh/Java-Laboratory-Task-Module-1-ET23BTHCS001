class Person {
    Person(String name, int age) {
        System.out.println("Person constructor called");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    Employee(String name, int age, String employeeId) {
        super(name, age);
        System.out.println("Employee constructor called");
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    Manager(String name, int age, String employeeId, String department) {
        super(name, age, employeeId);
        System.out.println("Manager constructor called");
        System.out.println("Department: " + department);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 35, "E123", "Sales");
    }
}

