package Day7;

import java.io.*;
import java.util.*;

public class CSVFileReader {
    public static void main(String[] args) {
        String fileName = "/Users/hebrion/IdeaProjects/DTI-Module1/src/Day7/resources/product_sales_data.csv"; // Replace with your CSV file name

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isFirstLine = true; // Flag to skip the header row
            Map<String, Integer> productCounts = new HashMap<>();
            double totalSales = 0;
            int totalProductsSold = 0;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip the first line (header)
                    continue;
                }

                String[] values = line.split(","); // Assuming CSV has comma-separated values

                // Assuming the format is: product_name, quantity, price
                String productName = values[0];
                int quantity = Integer.parseInt(values[1]);
                double price = Double.parseDouble(values[2]);

                productCounts.put(productName, productCounts.getOrDefault(productName, 0) + quantity);
                totalSales += quantity * price;
                totalProductsSold += quantity;
            }

            // Find most and least bought products
            String mostBoughtProduct = null;
            int maxQuantity = 0;
            String leastBoughtProduct = null;
            int minQuantity = Integer.MAX_VALUE;

            for (Map.Entry<String, Integer> entry : productCounts.entrySet()) {
                if (entry.getValue() > maxQuantity) {
                    mostBoughtProduct = entry.getKey();
                    maxQuantity = entry.getValue();
                }
                if (entry.getValue() < minQuantity) {
                    leastBoughtProduct = entry.getKey();
                    minQuantity = entry.getValue();
                }
            }

            System.out.println("Total Sales: " + totalSales);
            System.out.println("Total Products Sold: " + totalProductsSold);
            System.out.println("Most Bought Product: " + mostBoughtProduct);
            System.out.println("Least Bought Product: " + leastBoughtProduct);

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}