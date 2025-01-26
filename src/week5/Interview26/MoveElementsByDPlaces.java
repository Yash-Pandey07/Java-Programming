package week5.Interview26;

import java.sql.Array;
import java.util.Arrays;

public class MoveElementsByDPlaces {

    //right shift array elements by d=3 places;
    //output = [1,8,9,7,5,4,3,2]

    public static void main(String[] args) {
        int[] a = new int[]{7, 5, 4, 3, 2, 1, 8, 9};
        int d = 3;
        RightShiftArray(a, d);
        System.out.println(Arrays.toString(a));
    }

    public static void RightShiftArray(int[] a, int d) {
        int n = a.length;
        d = d % n;
        if (d == 0) return;
        reverse(a, 0, n - 1);   // 9,8,1,2,3,4,5,7
        reverse(a, 0, d - 1);    // 1,8,9,2,3,4,5,7
        reverse(a, d, n - 1);                // 1,8,9,7,5,4,3,2
    }

    public static void reverse(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
}
