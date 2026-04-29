import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        var n = new BigInteger(s);
        System.out.println(fib(n));

        sc.close();
    }

    public static BigInteger fib(BigInteger n) {
        var a = BigInteger.ZERO;
        var b = BigInteger.ONE;
        if (n.equals(a)) return a;
        if (n.equals(b)) return b;

        for (int i = 2; i <= Integer.parseInt(n.toString()); i++) {
            var temp = b;
            b = b.add(a);
            a = temp;
        }
        return b;
    }
}
