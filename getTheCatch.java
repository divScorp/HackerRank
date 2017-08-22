package easy;

import java.util.*;

public class getTheCatch {

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V){
        double [] res = new double[n];
        
        for(int i=0;i<n;i++){
            X[i]=Math.abs(x-X[i]);
        }
        for(int i=0;i<n;i++){
            res[i]=(X[i]/V[i]);
        }
        double min=res[0];
                int pos=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if((int)res[i]==(int)res[j]&&i!=j){
                pos=-1;
            }
           }
          }
        if(pos!=-1){
        for(int i=0;i<n;i++){
          if(res[i]<min){
                min=res[i];
                pos=i;
            }
        }
        }
       return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for(int X_i=0; X_i < n; X_i++){
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
        in.close();
    }
}
