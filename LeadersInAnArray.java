import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(Leaders(arr));
    }

    public static ArrayList<Integer> Leaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int l = arr.length;
        int cMax = arr[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            if (arr[i] > cMax) {
                leaders.add(arr[i]);
                cMax = arr[i];
            }
        }
        return leaders;
    }
}
