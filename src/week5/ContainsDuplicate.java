package week5;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i< nums.length; i++){
            if(hs.contains(nums[i])){
                return true ;
            }
            hs.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 5, 2};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}
