package week6;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        List<String> result = generateParenthesis(2);
        System.out.println(result);
    }
    public static  List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans , new StringBuilder(), 0, 0, n);
        return ans;
    }

    public static  void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max){

        //length of the string is max, at last char
        if(cur.length() == max*2){
            ans.add(cur.toString());
            return;
        }

        if(open < max){
            cur.append("(");
            backtrack(ans, cur, open + 1, close , max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close < open){
            cur.append(")");
            backtrack(ans, cur, open , close + 1, max);
            cur.deleteCharAt(cur.length()-1);
        }

    }

}
