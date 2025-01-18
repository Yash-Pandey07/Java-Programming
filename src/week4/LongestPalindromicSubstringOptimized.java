package week4;

public class LongestPalindromicSubstringOptimized {
    int start = 0, end = 0;

    // Method to find the longest palindromic substring
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray(); // Convert string to character array
        getString(chars, 0); // Call recursive function starting from index 0
        return s.substring(start, end + 1); // Return the longest palindromic substring
    }

    // Recursive method to expand around each character to find palindromes
    public void getString(char[] chars, int i) {
        int left = i;
        int right = i;
        int n = chars.length;

        // Base case to end recursion
        if (i >= n - 1) return;

        // Expand around center to handle even-length palindromes
        while (right < n - 1 && chars[right] == chars[right + 1]) {
            right++;
        }
        i = right;

        // Expand around center to handle odd-length palindromes
        while (left > 0 && right < n - 1 && chars[left - 1] == chars[right + 1]) {
            left--;
            right++;
        }

        // Update start and end if a longer palindrome is found
        if (right - left > end - start) {
            end = right;
            start = left;
        }

        // Recur with the next index
        getString(chars, i + 1);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LongestPalindromicSubstringOptimized sol = new LongestPalindromicSubstringOptimized();
        String input = "aabaacddcabacd";
        String result = sol.longestPalindrome(input);
        System.out.println("The longest palindromic substring is: " + result);
    }
}
