package easy;
/*
    Week of code 30 ( Minimum & maximum Loop Call )
    

    Solution by - Divyanshu Sharma
*/

import java.util.*;

public class Min_num {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String t = "";
		String beg = "min(int, ";
		String last = ")";
		String result = "min(int, int)";
		int count = 0;
		for (int i = 2; i < n; i++) {
			t = t.concat(beg);
			count++;
		}
		if (t == null) {
			System.out.print(result);
		} else {
			System.out.print(t + " " + result);
			for (int k = 0; k < count; k++) {
				System.out.print(last);
			}

		}
		in.close();
	}
}
