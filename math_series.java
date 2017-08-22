package easy;
import java.util.*;

class math_series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int q = (int) Math.pow(2, 0);
            sum += (a+(q*b));
        for(int j=1;j<n;j++)
                {
                    System.out.print(sum+" ");            
                    int sq=(int) Math.pow(2, j);
                     sum += (sq*b);                
        }              
            sum = 0;
            System.out.print("\n");
        }         
        in.close();
    }
}
