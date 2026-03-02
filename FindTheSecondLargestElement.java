import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,1,3,7,8,9,10,2};
        System.out.println("The Second Largest in the array is : " + findSecond(arr));
    }

    public static int findSecond(int[] arr){
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr){
            pq.add(i);
        }
        pq.remove();
        return pq.remove();
    }
}
