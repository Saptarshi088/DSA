public class FindLargestWordInAString {
    public static void main(String[] args) {
        String s = "A quick brown fox jumped over the lazy dog";
        System.out.println("The longest word is : '" + maxString(s) + "'");
    }

    public static String maxString(String s) {
        String max = "";
        for(String str : s.split(" ")){
            if(str.length()>max.length())
                max = str;
            
        }
        return max;
    }
}
