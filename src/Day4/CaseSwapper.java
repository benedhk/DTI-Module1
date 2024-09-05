package Day4;
import java.util.Scanner;

public class CaseSwapper {
    public static void swapCase(){
        Scanner in = new Scanner(System.in);
        System.out.print("Type something: ");
        String inputString = in.nextLine();
            String swappedString = "";
            for (char c : inputString.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    swappedString += Character.toLowerCase(c);
                } else {
                    swappedString += Character.toUpperCase(c);
                }
            }

            System.out.println("Swapped case string: " + swappedString);

    }
}
