public class CheckIfANumberIsAbundantNUmber {
    public static void main(String[] args) {
        int n = 18;
        System.out.println("The number " + n + " is abandunt number :" + isAbandunt(n));
    }

    public static boolean isAbandunt(int n){
        int factSum = 0;
        for(int i=1;i<(n/2)+1;i++){
            if(n%i==0){
                factSum+=i;
            }
        }
        return factSum>=n;
    }
}
