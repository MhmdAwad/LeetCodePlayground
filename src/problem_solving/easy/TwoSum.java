package problem_solving.easy;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
            if(map.get(nums[i]) != null){
                return new int[]{map.get(nums[i]), i};
            }else{
                int min = target - nums[i];
                map.put(min, i);
            }
        }
        return new int[]{};
    }
}
