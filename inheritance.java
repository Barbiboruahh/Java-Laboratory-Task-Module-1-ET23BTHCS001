class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println("Person Info:");
        p.displayInfo();

        System.out.println("\nTeacher Info:");
        Teacher t = new Teacher("Bob", 40, "Math", 50000);
        t.displayInfo();
    }
}
    
