import problem_solving.meduim.AddTwoNumbers.ListNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int[] nums = new int[]{2,3,6,7};
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};


        System.out.println(">>>>>>? " + threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        if(nums.length < 3) return list;
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            if(i > 0 && (nums[i-1] == nums[i]))
                continue;

            int left = i+1 , right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    list.add(tmp);
                    left++;
                    while ((nums[left] == nums[left-1]) && (left < right)) left++;
                } else if (sum > 0) {
                    right--;
                }else {
                    left++;
                }
            }
        }
        return list;
    }
}

