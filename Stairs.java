package easy;
import java.util.*;

public class Stairs {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int st = scan.nextInt();       
        for(int i=0 ; i<st ;i++){
            for(int j = 0; j <= st-(i+2); j++)
                System.out.print(" ");
            
            for(int j = st-(i+1) ; j< st; j++)
                System.out.print("#");            
            System.out.println();
        }
        scan.close();
    }
}