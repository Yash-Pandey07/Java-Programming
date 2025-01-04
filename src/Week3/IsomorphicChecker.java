package Week3;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicChecker {
    public static void main(String[] args) {
        String s = "ABC"; //"egg";
        String t = "XPZ";//"add";
        if (isIsomorphic(s, t)) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }

    private static boolean isIsomorphic(String s, String t) {

//        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (map.containsValue(c2)) return false;
                map.put(c1, c2);
            }
        }

        return true;
    }
}
