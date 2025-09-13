import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CheckIfArrayHasDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> set = new HashSet<>(list);
        
        if (set.size() == list.size()) {
            System.out.println("Array Does Not Contain duplicate");
        } else {
            System.out.println("Array Contains Duplicate");
        }
    }
}
