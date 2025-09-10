import java.util.Scanner;

class student {
    private String name;
    private int id;
    private double marks;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student ID: ");
        id = sc.nextInt();

        System.out.print("Enter student marks: ");
        marks = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }
}

public class student1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.inputDetails();
        s1.displayDetails();
    }
}