
import java.util.*;
import java.util.stream.Collectors;

import static problem_solving.easy.longestCommonPrefix.longestCommonPrefix;
import static problem_solving.meduim.StrWithout3a3b.strWithout3a3b;


public class Main {

    public static void main(String[] args) {

        System.out.println(">>>>>>>>>?? "+isValid("([)]"));

    }
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            switch (c){
                case '(':
                    stack.add(')');
                    break;
                case '[':
                    stack.add(']');
                    break;
                case '{':
                    stack.add('}');
                    break;
                default:{
                    if(stack.isEmpty() || stack.pop() != c){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}

