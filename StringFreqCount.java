import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringFreqCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = Set.of(' ', ',', '!', '.', ':');
       
        String s = sc.nextLine();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) continue;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map.toString());

        sc.close();
    }
}
