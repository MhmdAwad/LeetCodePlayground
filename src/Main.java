import problem_solving.meduim.AddTwoNumbers.ListNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int[] nums = new int[]{2,3,6,7};
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};

        System.out.println(">>>>>>? " + getSum(-3));

    }

    public static int getSum(int a) {

        int count = 0;
        while (a != 0){
            a = a & (a-1);
            count++;
        }
        return count;
    }   
}

