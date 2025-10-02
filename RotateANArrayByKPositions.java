import java.util.Arrays;

public class RotateANArrayByKPositions {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        int k = 3;
        System.out.println("Rotated Array: " + Arrays.toString(rotateK(arr, k)));
    }

    public static int[] rotateK(int[] arr, int k) {
        int rotated[] = new int[arr.length];
        int index = 0;
        for (int i = k; i < arr.length; i++) {
            rotated[index] = arr[i];
            index++;
        }
        for (int i = 0; i < k - 1; i++) {
            rotated[index++] = arr[i];
        }
        return rotated;
    }
}
