package problem_solving.easy;

import java.util.Arrays;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs[0].isEmpty()) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return index == 0? "" : first.substring(0, index);
    }

}
