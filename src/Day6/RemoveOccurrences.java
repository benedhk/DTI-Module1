package Day6;

import java.util.ArrayList;
import java.util.List;

public class RemoveOccurrences {
    public static List<Integer> removeOccurrences(List<Integer> array, int key) {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num != key) {
                result.add(num);
            }
        }
        return result;
    }
}