package problem_solving.easy;

import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        int value = 0;
        int prevValue =0;
        HashMap<Character, Integer > map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (char c : s.toCharArray()){
            int currentValue = map.get(c);
            if(currentValue <= prevValue){
                value += currentValue;
            }else{
                value -= prevValue;
                value +=currentValue - prevValue;
            }
            prevValue = currentValue;
        }
        return value;
    }
}
