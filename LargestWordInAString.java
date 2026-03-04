public class LargestWordInAString {
    public static void main(String[] args) {
        String s = "A quick brown fox jumped over the lazy dog";
        System.out.println("The longest word is : '" + maxString(s) + "'");
    }

    public static String maxString(String s) {
        String[] arr = s.split(" ");
        int max = 0;
        String maxString = "";
        for (String str : arr) {
            if (str.toCharArray().length > max) {
                max = str.toCharArray().length;
                maxString = str;
            }
        }
        return maxString;
    }
}
