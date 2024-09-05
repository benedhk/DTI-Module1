package Day3;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        String numberString = Integer.toString(number); //Convert to string: Integer.toString(number) converts the integer number to a string.
        char[] digits = numberString.toCharArray(); //Create array: numberString.toCharArray() converts the string into an array of characters.
//12 -> [1] [2]
        /*Iterate and sum: The for loop iterates over each character in the array,
        converts it to an integer using Character.getNumericValue(), and adds it to the sum.*/
        int sum = 0;
        for (char digit : digits) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }

}

/* int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;*/