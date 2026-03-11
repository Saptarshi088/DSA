import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6,1};
        System.out.println(java.util.Arrays.toString(intercection(arr1, arr2)));
    }

    public static int[] intercection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> common = new ArrayList<>();
        for (int i : arr1)
            set.add(i);
        for (int i : arr2) {
            if (set.contains(i)) {
                common.add(i);
            }
        }
        int[] res = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            res[i] = common.get(i);


        }
        return res;
    }
}
