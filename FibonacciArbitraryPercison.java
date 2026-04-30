import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciArbitraryPercison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        BigInteger b = new BigInteger(n);
        System.out.println(fibonacci(b).toString());

        sc.close();
    }

    public static BigInteger fibonacci(BigInteger n) {
        var a = BigInteger.ONE;
        var b = BigInteger.ZERO;
        for (
            var i = BigInteger.ZERO;
            i.compareTo(n) < 0;
            i = i.add(BigInteger.ONE)
        ) {
            var temp = a;
            a = a.add(b);
            b = temp;
        }
        return b;
    }
}
