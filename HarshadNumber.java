public class HarshadNumber {
    public static void main(String[] args) {
        int n = 378;
        System.out.println("The given number is Harshad number : " + isHarshad(n));
    }

    public static boolean isHarshad(int n){
        int sumRem = 0;
        int placeHolder = n;
        while(placeHolder>0){
            int rem = placeHolder%10;
            sumRem += rem;
            placeHolder /=10;
        }
        return n%sumRem == 0 ? true :false;
    }
}
