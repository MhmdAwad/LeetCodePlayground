package problem_solving.meduim;

public class StrWithout3a3b {
    public static String strWithout3a3b(int a, int b) {
        // a = 2 ; b = 5;
        // "bbabbab"
        StringBuilder builder = new StringBuilder();
        while (a+b > 0){
            if(a ==0 || b==0){
                while (b-- > 0) builder.append('b');
                while (a-- > 0) builder.append('a');
            }
            if(a > b && a > 1){
                builder.append("aab");
                a-=2;
                b--;
            }else if(b > a && b > 1){
                builder.append("bba");
                b-=2;
                a--;
            }else if(a==b){
                builder.append("ab");
                a--;
                b--;
            }
        }

        return builder.toString();
    }


}
