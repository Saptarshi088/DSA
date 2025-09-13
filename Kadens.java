public class Kadens {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(kadens(arr));
    }

    public static int kadens(int[] arr) {
        if (arr.length == 0) {
            return -Integer.MIN_VALUE;
        }

        int curSum = 0;
        int maxSum = 0;
        int arrMax = arr[0];

        for (int i = 0; i < arr.length; i++) {

            curSum += arr[i];

            if (curSum > maxSum) {
                maxSum = curSum;
            }

            if (curSum < 0) {
                curSum = 0;
            }

            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }

        if (arrMax < 0) {
            return arrMax;
        }

        return maxSum;
    }
}