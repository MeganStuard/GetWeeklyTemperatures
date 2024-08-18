package getweeklytemperatures;

import java.util.ArrayList;
import java.util.Scanner;

public class GetWeeklyTemperatures {
    public static void main(String[] args) {
        // Initialize the ArrayLists
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Populate the days of the week
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Loop to get temperatures for each day
        for (String day : daysOfWeek) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        // Loop to process user input for specific day or week summary
        while (true) {
            System.out.print("Enter a day of the week to see the temperature or type 'week' to see the weekly summary: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("week")) {
                double totalTemp = 0.0;
                System.out.println("\nWeekly Summary:");
                for (int i = 0; i < daysOfWeek.size(); i++) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°C");
                    totalTemp += temperatures.get(i);
                }
                double weeklyAverage = totalTemp / daysOfWeek.size();
                System.out.println("Weekly Average Temperature: " + weeklyAverage + "°C");
                break;
            } else if (daysOfWeek.contains(input)) {
                int index = daysOfWeek.indexOf(input);
                System.out.println(input + "'s average temperature: " + temperatures.get(index) + "°C");
            } else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }

        scanner.close();
    }
}
