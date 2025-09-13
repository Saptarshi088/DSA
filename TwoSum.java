import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 7;
        System.out.println(java.util.Arrays.toString(twoSum(nums, target)));
        System.out.println(java.util.Arrays.toString(twoSum0n2(nums, target)));
    }

    // time complexity: O(n)
    // space complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                return new int[] { i, map.get(rem) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

    // time complexity: O(n^2)
    // space complexity: O(1)
    public static int[] twoSum0n2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
