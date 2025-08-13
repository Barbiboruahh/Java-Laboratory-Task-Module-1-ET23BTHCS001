public class OptionalTask {

    public static void main(String[] args) {
        // Initial values for the optional task
        byte age = 25;
        short distance = 15000;
        float pi = 3.14f;
        boolean isJavaFun = true;

        // Perform calculations
        int sum = age + distance;
        boolean result = isJavaFun && (pi < 3.5);

        // Print the results
        System.out.println("Sum of age and distance: " + sum);
        System.out.println("Is Java fun and pi < 3.5? " + result);
    }
}
    

