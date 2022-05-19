import problem_solving.meduim.AddTwoNumbers.ListNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int value = reverseBits(43261596);
                System.out.println(">>>>>>? " +value +" == "+ (value == 964176192) );

    }

    //00000010100101000001111010011100
    public static int reverseBits(int n) {
        int sum = 0;
        for(int i=0; i < 32; i++){
            sum <<= 1;
            sum += (n & 1);
            n >>= 1;
        }
        return sum;
    }
}

