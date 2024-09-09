package Day5;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined exchange rates
        double USD_TO_EUR = 0.92;
        double EUR_TO_USD = 0.64;
        double USD_TO_GBP = 0.79;
        double USD_TO_JPY = 147.65;

        // Get user input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Convert currency
        double convertedAmount = 0;
        if (sourceCurrency.equals("USD")) {
            if (targetCurrency.equals("EUR")) {
                convertedAmount = amount * USD_TO_EUR;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount * USD_TO_GBP;
            } else if (targetCurrency.equals("JPY")) {
                convertedAmount = amount * USD_TO_JPY;
            }
        } else if (sourceCurrency.equals("EUR")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount * EUR_TO_USD;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount * EUR_TO_USD * USD_TO_GBP;
            } else if (targetCurrency.equals("JPY")) {
                convertedAmount = amount * EUR_TO_USD * USD_TO_JPY;
            }
        } else if (sourceCurrency.equals("GBP")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount / USD_TO_GBP;
            } else if (targetCurrency.equals("EUR")) {
                convertedAmount = amount / USD_TO_GBP * USD_TO_EUR;
            } else if (targetCurrency.equals("JPY")) {
                convertedAmount = amount / USD_TO_GBP * USD_TO_JPY;
            }
        } else if (sourceCurrency.equals("JPY")) {
            if (targetCurrency.equals("USD")) {
                convertedAmount = amount / USD_TO_JPY;
            } else if (targetCurrency.equals("EUR")) {
                convertedAmount = amount / USD_TO_JPY * USD_TO_EUR;
            } else if (targetCurrency.equals("GBP")) {
                convertedAmount = amount / USD_TO_JPY * USD_TO_GBP;
            }
        }

        // Print the result
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
    }
}