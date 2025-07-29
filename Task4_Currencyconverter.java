import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example rates: 1 USD to others
        double usdToInr = 83.10;
        double usdToEur = 0.91;

        System.out.println("Enter amount in USD:");
        double amount = scanner.nextDouble();

        System.out.println("Convert to: (1) INR  (2) EUR");
        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {
            result = amount * usdToInr;
            System.out.println(amount + " USD = " + result + " INR");
        } else if (choice == 2) {
            result = amount * usdToEur;
            System.out.println(amount + " USD = " + result + " EUR");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
