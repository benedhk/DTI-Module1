package Day4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberReader {
    public static void readNumber(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            numbers.add(number);
            System.out.println("Do you want to read continue? y/n: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println("The entered number is " + numbers);
    }
}
