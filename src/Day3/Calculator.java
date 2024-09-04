package Day3;

public class Calculator {
    public static double performOperation(int choiceCalc, double num1, double num2) {
        return switch (choiceCalc) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    yield Double.NaN;
                }
                yield num1 / num2; //NaN: Not a Number
            }
            default -> {
                System.out.println("Invalid choice.");
                yield Double.NaN;
            }
        };
    }
}