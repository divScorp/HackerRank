package easy;
import java.util.*;

public class Min_max {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long max, min, sum;
         sum = max = min = in.nextLong();
        for(int i=1; i<5;i++){
            long a = in.nextLong();
            sum=sum+a;            
            if(a>max) max=a;
            if(a<min) min=a;
        }
        System.out.print((sum - max) + " " + (sum - min));
        in.close();
    }
}
