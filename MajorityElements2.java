import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements2 {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 2, 2, 3, 4, 5 };
        System.out.println(majorityEements2(nums));
    }

    public static List<Integer> majorityEements2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> majorityElements = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                majorityElements.add(entry.getKey());
            }
        }
        return majorityElements;
    }
}
