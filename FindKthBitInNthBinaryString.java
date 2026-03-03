public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1)); // Output: '0'
        System.out.println(findKthBit(4, 11)); // Output: '1'
    }

    public static char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");

        for (int i = 1; i < n; i++) {
            sb.append("1");

            StringBuilder inverted = invert(new StringBuilder(sb.substring(0, sb.length() - 1)));
            reverse(inverted);
            sb.append(inverted);
        }

        return sb.charAt(k - 1); 
    }

    public static StringBuilder invert(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, sb.charAt(i) == '0' ? '1' : '0');
        }
        return sb;
    }

    public static void reverse(StringBuilder sb) {
        sb.reverse();
    }
}
