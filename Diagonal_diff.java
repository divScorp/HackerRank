package easy;
/*
    Diagonal Differences (Sum of Diagonal values)

    by - Divyanshu Sharma
*/

import java.util.*;

public class Diagonal_diff{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int left = 0,right = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                 if(i == j){
                   left += a[i][j];
                }
                if(i==(n-(j+1))){
                    right += a[i][j];
                }
            }
        }        
        int result = Math.abs(left-right);
        System.out.println(result);
        in.close();
    }
}



