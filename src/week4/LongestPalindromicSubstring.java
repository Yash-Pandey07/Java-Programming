package week4;

public class LongestPalindromicSubstring {
    // Method to find the longest palindromic substring
    public static String longestPalindromicSubstring(String s) {
        int n = s.length();
        if (n == 0) return ""; // If the string is empty, return an empty string

        int longestStart = 0; // Starting index of the longest palindromic substring
        int maxLength = 1;    // Length of the longest palindromic substring

        // Loop through each character in the string
        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            int[] odd = expandAroundCenter(s, i, i);
            if (odd[1] - odd[0] + 1 > maxLength) {
                longestStart = odd[0];
                maxLength = odd[1] - odd[0] + 1;
            }

            // Even length palindromes
            int[] even = expandAroundCenter(s, i, i + 1);
            if (even[1] - even[0] + 1 > maxLength) {
                longestStart = even[0];
                maxLength = even[1] - even[0] + 1;
            }
        }

        // Return the longest palindromic substring
        return s.substring(longestStart, longestStart + maxLength);
    }

    // Helper method to expand around the center of the palindrome
    private static int[] expandAroundCenter(String s, int left, int right) {
        int n = s.length();
        // Expand outwards as long as the characters are equal
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return new int[]{left + 1, right - 1};
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String input = "aabaacddcabacd";
        String result = longestPalindromicSubstring(input);
        System.out.println("The longest palindromic substring is: " + result);
    }
}

