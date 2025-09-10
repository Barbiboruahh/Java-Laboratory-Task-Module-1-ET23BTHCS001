import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        sc.close();
    }
}

