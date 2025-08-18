import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1 – Celsius to Fahrenheit");
        System.out.println("2 – Fahrenheit to Celsius");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        int inputTemp;
        int outputTemp;

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            inputTemp = scanner.nextInt();
            outputTemp = (inputTemp * 9 / 5) + 32; // integer math
            System.out.println(inputTemp + " °C = " + outputTemp + " °F");

        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            inputTemp = scanner.nextInt();
            outputTemp = (inputTemp - 32) * 5 / 9; // integer math
            System.out.println(inputTemp + " °F = " + outputTemp + " °C");

        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
