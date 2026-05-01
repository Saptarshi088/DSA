public class SwapTwoVarUsingXor {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("BEFORE SWAP");
        System.out.println("a : " + a + "\nb : " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("AFTER SWAP");
        System.out.println("a : " + a + "\nb : " + b);
    }
}
