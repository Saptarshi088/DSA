import java.util.HashMap;
import java.util.Map;

public class MajorityEement {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 5 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
