import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrongNubmer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(isArmstrong(n)){
            System.out.println(n + " is an Armstring Number.");
        } else{
            System.out.println(n + " is not an Armstrong Number.");
        }


        sc.close();
    }

    public static boolean isArmstrong(int n){

        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        int res = 0;
        int placeHolder = n;

        while(n>0){
            int rem = n%10;
            arr.add(rem);
            n = n/10;
            c++;
        }

        for(int i : arr){
            res = (int) (res + Math.pow(i, c));
        }

        if(res == placeHolder) return true;
        return false;
    }

}
