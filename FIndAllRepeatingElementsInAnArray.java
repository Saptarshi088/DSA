import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FIndAllRepeatingElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
        System.out.println(findRepetingElements(arr));
    }

    public static List<Integer> findRepetingElements(int[] arr) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                res.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return res;
    }
}
