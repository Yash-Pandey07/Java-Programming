package Week3;

public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        if (isPangram(str)){
            System.out.println("The string is Panagram");
        }else {
            System.out.println("The string is not Panagram");
        }
    }
//optimise wit hashmap
    public static boolean isPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i=0; i<str.length(); i++){
            if('A'<= str.charAt(i) && str.charAt(i) <='Z'){
                index = str.charAt(i) - 'A';
            }else if ( 'a' <= str.charAt(i) && str.charAt(i) <='z'){
                index = str.charAt(i) - 'a';
            }
            mark[index] = true;

        }
        for (int i=0;i<26;i++){
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}
