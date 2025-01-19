package week4;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnesBest(int[] arr) {
        int maxCount = 0;
        int count = 0;
        boolean insideZeros = false;

        for (int num : arr) {
            if (num == 0) {
                if (insideZeros) {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
                }
                insideZeros = true;
            } else if (insideZeros) {
                count++;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0};
        System.out.println(maxConsecutiveOnesBest(sequence));  // Output: 3
    }
}

