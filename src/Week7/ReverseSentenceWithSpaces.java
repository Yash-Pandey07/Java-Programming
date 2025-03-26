package Week7;

public class ReverseSentenceWithSpaces {
    public static void main(String[] args) {
        String sentence = "I  love  coding";
        System.out.println("Input:  \"" + sentence + "\"");
        System.out.println("Output: \"" + reverseSentence(sentence) + "\"");
    }

    public static String reverseSentence(String sentence) {
        char[] chars = sentence.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Skip spaces
            while (left < right && chars[left] == ' ') left++;
            while (left < right && chars[right] == ' ') right--;

            // Swap characters
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
