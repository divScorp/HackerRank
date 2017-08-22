package easy;
import java.util.*;

public class PatternCount {

    static int patternCount(String s){
       int x=10;
       return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
        in.close();
    }
}
