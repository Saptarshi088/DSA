import java.math.BigInteger;
import java.util.Scanner;

public class FactorialArbitraryPercision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) throw new RuntimeException(
            "The value can not be 0 or less"
        );

        BigInteger input = BigInteger.valueOf(n);
        BigInteger result = fact(input);
        System.out.println(result.toString());
    }

    public static BigInteger fact(BigInteger n) {
        BigInteger res = BigInteger.ONE;
        for (
            BigInteger i = BigInteger.ONE;
            i.compareTo(n) <= 0;
            i = i.add(BigInteger.ONE)
        ) {
            res = res.multiply(i);
        }
        return res;
    }
}
