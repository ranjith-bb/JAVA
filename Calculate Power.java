import java.util.Scanner;
public class CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
}
