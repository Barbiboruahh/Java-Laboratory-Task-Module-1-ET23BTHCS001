import java.util.Scanner;

    public class rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);

        scanner.close();
    }
}

    

