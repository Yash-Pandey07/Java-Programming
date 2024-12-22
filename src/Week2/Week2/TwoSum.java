package Week2.Week2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] arg) {
        int[] numsArray = {2, 3, 6, 4, 8, 5, 2, 1, 6, 3 ,4};
        int target = 7;
//        int[] pair = new int[2];
//        pair = arrPair(numsArray , target);
//        System.out.println(Arrays.toString(pair));
        List<int[]> pairs = arrSinglePair(numsArray, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static int[] arrPair(int[] numsArray, int target) {

        //Brute force
//        run 2 loop for i and j , sum the value of each and then return the pair
//        run loop for i from 0 , and j from i+1
//        int[] arr= new int[2];
//        for(int i=0;i<numsArray.length;i++){
//            int Newtarget=target-numsArray[i];
//            for(int j=i+1;j<numsArray.length;j++){
//                if(numsArray[j]==Newtarget){
//                    arr[0]=i;
//                    arr[1]=j;
//                    return arr;
//                }
//            }
//        }
//        return arr;
        //Better
//        using hashmap to store each element and their indexes ,
//        then in a single loop check the hashmap to get if its pair is there or not ,
//        if yes return the pair or else add into hashmap the element and its index
        int n = numsArray.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = numsArray[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(numsArray[i], i);
        }
        return ans;

    }

    public static List<int[]> arrSinglePair(int[] numsArray, int target) {
        List<int[]> result = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < numsArray.length; i++) {
            int num = numsArray[i];
            int moreNeeded = target - num;
//            if (mpp.containsKey(moreNeeded)) {
//                result.add(new int[]{mpp.get(moreNeeded), i});     //return the position
//                result.add(new int[]{moreNeeded, num});           //return the exact number
//            }
//            mpp.put(numsArray[i], i);
//            We only add numbers to the HashMap if they haven't been used yet.
            if (mpp.containsKey(moreNeeded) && mpp.get(moreNeeded) != -1) {
                result.add(new int[]{moreNeeded, num});
                // Mark the numbers as used
                mpp.put(moreNeeded, -1);
                mpp.put(num, -1);
            } else if (!mpp.containsKey(num)) {
                mpp.put(num, i);
            }
        }
    return result;
    }
}
