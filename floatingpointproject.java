package floatingpointproject;

import java.util.Scanner;

public class floatingpointproject { 

    public static void main(String[] args) {
        // Initialize variables
        double total = 0.0;
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        // Use a while loop to read five floating-point values
        while (count < 5) {
            System.out.print("Enter floating-point value " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                // Update total
                total += value;

                // Update maximum
                if (value > maximum) {
                    maximum = value;
                }

                // Update minimum
                if (value < minimum) {
                    minimum = value;
                }

                // Increment counter
                count++;
            } else {
                System.out.println("Please enter a valid floating-point number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();

        // Calculate average
        double average = total / 5;

        // Calculate interest on total at 20%
        double interest = total * 0.20;

        // Print the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);
    }
}
