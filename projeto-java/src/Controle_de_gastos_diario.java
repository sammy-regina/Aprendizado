package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Controle_de_gastos_diario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Ensures correct decimal point interpretation (e.g., 100.50 instead of 100,50)

        int purchaseCount = scanner.nextInt(); // Reads the number of purchases

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // Loop to read each purchase value and add it to totalSpent
            for (int i = 0; i < purchaseCount; i++) {
                double purchaseValue = scanner.nextDouble();
                totalSpent += purchaseValue;
            }

            double averageSpent = totalSpent / purchaseCount; // Calculate the average

            System.out.printf("%.2f%n", totalSpent); // Prints the total spent, formatted to two decimal places
            System.out.printf("%.2f%n", averageSpent); // Prints the average spent, formatted to two decimal places
        }

        scanner.close(); // Closes the scanner to release resources
    }
}
