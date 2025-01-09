package week4;

public class ConsecutiveMinusOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 1; // Change this value to the desired length of consecutive -1s
        System.out.println(countConsecutiveMinusOnes(arr, k));
    }

    public static int countConsecutiveMinusOnes(int[] arr, int k) {
        int count = 0;
        int consecutiveCount = 0;

        for (int num : arr) {
            if (num == -1) {
                consecutiveCount++;
                if (consecutiveCount == k) {
                    count++;
                    consecutiveCount = 0; // Reset the count to find non-overlapping sequences
                }
            } else {
                consecutiveCount = 0; // Reset the count if the sequence is broken
            }
        }

        return count;
    }
}
