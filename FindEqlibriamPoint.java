public class FindEqlibriamPoint {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -1, 8, 4 };
        if(eqIndex(arr)==-1){
            System.out.println("There is no equilibriam point in the array");
        }
        else{
            System.out.println("The equilibriam point is at index : " + eqIndex(arr));
        }
    }

    public static int eqIndex(int[] arr) {
        int l = arr.length;
        int prefix = 0;
        int cSum = 0;
        for (int i : arr) {
            prefix += i;
        }
        for (int i = 0; i < l; i++) {
            prefix -= arr[i];
            if (cSum == prefix) {
                return i;
            }
            cSum += arr[i];
        }

        return -1;
    }
}
