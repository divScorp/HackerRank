package easy;
import java.util.*;


public class NumericString {

    static int getMagicNumber(String str, int sub_len, int base, int modulo){
        // Complete this function
        int[] newarray = new int[str.length()];
        for(int i=0;i<str.length();i++){
            newarray[i] = str.charAt(i)-'0';
        }
        //test:
        int t=0, res=0;
        int sum=0;
       // int[] rs=null;
        for(int j=t, b=base-1;j<base;j++,b--){
            int x =(int) Math.pow(base, b);
            res = res + (newarray[j]*(x));
            if(j!=newarray.length-1){
               sum=sum+(res%modulo);
               t++;
            }
            
        }
//        for(int i=0;i<rs.length-1;i++){
//            sum+=(rs[i]%modulo);
//        }        
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sub_len = in.nextInt();
        int base = in.nextInt();
        int modulo = in.nextInt();
        int result = getMagicNumber(str, sub_len, base, modulo);
        System.out.println(result);
        in.close();
    }
}
