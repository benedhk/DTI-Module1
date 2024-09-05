package Day3;

import java.util.Scanner;
import java.util.ArrayList;

import static Day3.LargestElementFinder.findLargest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a task:");
        System.out.println("1. Calculate the sum of digits");
        System.out.println("2. Check if a number is prime");
        System.out.println("3. Find the largest elements in an array");
        System.out.println("4. Simple Calculator");
        System.out.println("5. Reverse a string");
        System.out.println("6. Fibonacci");
        System.out.println("7. Count the number of vowels");
        System.out.println("8. Sorting");
        System.out.println("9. Anagrams");
        System.out.println("10. Second smallest elements in an array");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: //1. Write a program to calculate the sum of digits in a given number.
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                int digitSum = DigitSumCalculator.calculateDigitSum(number);
                System.out.println("Sum of digits: " + digitSum);
                break;
            case 2:
                System.out.print("Enter a number: ");
                number = scanner.nextInt();
                boolean isPrime = PrimeNumberChecker.isPrime(number);
                System.out.println(number + " is prime: " + isPrime);
                break;
            case 3:
                // Prompt the user to enter elements until they enter a sentinel value
                System.out.println("Enter elements (enter 0 to stop):");
                ArrayList<Integer> numbers = new ArrayList<>(); //ArrayList to dynamically store the elements entered by the user.
                do {
                    number = scanner.nextInt();
                    if (number != 0) {
                        numbers.add(number);
                    }
                } while (number != 0);

                // Convert the ArrayList to an array
                int[] arr = new int[numbers.size()];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = numbers.get(i);
                }

                // Find and print the largest element
                int largest = findLargest(arr);
                System.out.println("Largest element: " + largest);
                break;
            case 4:
                System.out.println("Choose an operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.print("Enter your choice: ");
                int choiceCalc = scanner.nextInt();

                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result = Calculator.performOperation(choiceCalc, num1, num2);
                System.out.println("Result: " + result);
                break;
            case 5:
                System.out.print("Enter a string: ");
                scanner.nextLine();
                String str5 = scanner.nextLine();
                String reversedStr = StringReverser.reverseString(str5);
                System.out.println("Reversed string: " + reversedStr);
                break;
            case 6:
                System.out.print("Enter the number of terms: ");
                int n6 = scanner.nextInt();

                int[] fibonacciSequence = FibonacciGenerator.generateFibonacciSequence(n6);
                System.out.println("Fibonacci sequence:");
                for (int num : fibonacciSequence) {
                    System.out.print(num + " ");
                }
                break;
            case 7:
                System.out.print("Enter a string: ");
                scanner.nextLine();
                String str7 = scanner.nextLine();
                int vowelCount = VowelCounter.countVowels(str7);
                System.out.println("Number of vowels: " + vowelCount);
                break;
            case 8:
                System.out.print("Enter the number of elements in the array: ");
                int n8 = scanner.nextInt();

                int[] arr8 = new int[n8];
                System.out.println("Enter the elements:");

                for (int i = 0; i < n8; i++) {
                    arr8[i] = scanner.nextInt();
                }

                BubbleSort.sort(arr8);
                System.out.println("Sorted array:");
                for (int num : arr8) {
                    System.out.print(num + " ");
                }
            case 9:
                System.out.print("Enter the first string: ");
                String str1 = scanner.nextLine();
                System.out.print("Enter the second string: ");
                String str2 = scanner.nextLine();

                boolean areAnagrams = AnagramChecker.areAnagrams(str1, str2);
                System.out.println("Are the strings anagrams? " + areAnagrams);
                break;
            case 10:
                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();

                int[] arr10 = new int[n];
                System.out.println("Enter the elements:");

                for (int i = 0; i < n; i++) {
                    arr10[i] = scanner.nextInt();
                }

                int secondSmallest = SecondSmallestFinder.findSecondSmallest(arr10);
                System.out.println("Second smallest element: " + secondSmallest);
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

}

