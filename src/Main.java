
import java.util.*;
import java.util.stream.Collectors;

import static problem_solving.easy.longestCommonPrefix.longestCommonPrefix;
import static problem_solving.meduim.StrWithout3a3b.strWithout3a3b;


public class Main {

    public static void main(String[] args) {

        System.out.println(">>>>>>>>>?? "+searchInsert(new int[]{1,3,5,6}, 4));

    }
    public static int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length-1;
        // 1  3  5  6
        //
        while (first < last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return first;
    }

}

