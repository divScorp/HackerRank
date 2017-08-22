package easy;
/*

    Week of code 30 (Candy Spleshing Robo)
    
    Solution by - Divyanshu Sharma
*/


import java.util.*;

public class candyRobo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
       int x=0,res=0;
       for(int i=0;i<t;i++){
           int b = c[i];
           x= x+b;
           n = n-b;
           if(n<5 && i<t-1){             
               res = res + x;
               n=n+x;
               x=0;
           }
       }
       System.out.println(res);
       in.close();
    }
}