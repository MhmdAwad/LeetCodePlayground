import problem_solving.meduim.AddTwoNumbers.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        int[] nums = new int[]{2,3,6,7};
        int[] nums = new int[]{1,2,3,4};

//        System.out.println(">>>>>>? " + combinationSum(nums, 7));
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int last = 1;
        ans[0] = 1;
        for (int i =1; i < length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        for(int i = length-1; i >= 0; i--){
            ans[i] *= last;
            last *= nums[i];
        }
        return ans;
    }
}

