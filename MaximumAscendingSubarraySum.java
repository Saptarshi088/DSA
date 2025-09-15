public class MaximumAscendingSubarraySum {

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        System.out.println("The Maximum Ascending Subarray Sum is: " + maximumAscendingSubarraySum(nums));
    }

    // time complexity: O(n)
    // space complexity: O(1)
    public static int maximumAscendingSubarraySum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                cur += nums[i];
            } else {
                cur = nums[i];
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
