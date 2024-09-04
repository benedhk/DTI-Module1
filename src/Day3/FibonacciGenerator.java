package Day3;

public class FibonacciGenerator {
    public static int[] generateFibonacciSequence(int n) {
        int[] sequence = new int[n];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;

    }
}
