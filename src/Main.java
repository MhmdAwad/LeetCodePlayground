
import java.util.*;
import java.util.stream.Collectors;

import static problem_solving.easy.longestCommonPrefix.longestCommonPrefix;
import static problem_solving.meduim.StrWithout3a3b.strWithout3a3b;


public class Main {

    public static void main(String[] args) {

        System.out.println(">>>>>>>>>?? "+removeDuplicates(new int[]{1,1,2,2,2,3,4,4,5}));

    }
    public static int removeDuplicates(int[] nums) {

        int pointer = 0;
        for(int i = 1; i< nums.length; i++){
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer+1;
    }

}

