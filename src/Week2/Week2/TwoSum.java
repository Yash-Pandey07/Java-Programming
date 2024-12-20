package Week2.Week2;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] arg) {
        int[] numsArray = {2,7,11,15};
        int target = 9;
        int[] pair = new int[2];
        pair = arrPair(numsArray , target);
        System.out.println(Arrays.toString(pair));

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
        int n= numsArray.length;
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
}
