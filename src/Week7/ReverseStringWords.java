package Week7;

public class ReverseStringWords {
    public static void main(String[] args) {
//        String input = "Yash Pandey";
//
//        // Find the position of the space
//        int spaceIndex = input.indexOf(' ');
//
//        // Extract the two words
//        String firstWord = input.substring(0, spaceIndex);
//        String secondWord = input.substring(spaceIndex + 1);
//
//        // Rebuild the string in reversed order
//        String reversedOutput = secondWord + " " + firstWord;
//
//        // Output the result
//        System.out.println(reversedOutput);

        String input = "yash pandey copilot microsoft";
        StringBuilder reversedOutput = new StringBuilder();

        // Start from the end of the string
        int end = input.length();

        while (end > 0) {
            // Find the last space
            int start = input.lastIndexOf(' ', end - 1);

            // Append the word to the result
            reversedOutput.append(input.substring(start + 1, end)).append(" ");

            // Update the end to the position of the space
            end = start;
        }

        // Trim trailing space and print the reversed string
        System.out.println(reversedOutput.toString().trim());
    }
}