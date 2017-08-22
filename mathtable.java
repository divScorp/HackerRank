package easy;

import java.util.*;

public class mathtable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i=1; i<=10; i++){
            int res = N*i;
            System.out.println(N+" x "+i+" = "+res);
            
        }
        in.close();
    }
}
