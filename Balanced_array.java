package easy;

import java.util.*;

public class Balanced_array {

	static int solve(int[] a) {
		// Complete this function
		int first_half;
		int res1 = 0, res2 = 0;
		first_half = (a.length / 2);
		// second_half=a.length;
		for (int i = 0; i < first_half; i++) {
			res1 = res1 + a[i];
		}
		for (int i = first_half; i < a.length; i++) {
			res2 = res2 + a[i];
		}
		if (res1 == res2) {
			return 0;
		} else if (res1 > res2) {
			return (res1 - res2);
		} else {
			return (res2 - res1);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = solve(a);
		System.out.println(result);
		in.close();
	}
}
