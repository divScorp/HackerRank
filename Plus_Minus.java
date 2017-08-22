package easy;

import java.util.*;

public class Plus_Minus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		double pos = 0, neg = 0, zero = 0;

		for (int j = 0; j < n; j++) {
			if (arr[j] == 0) {
				zero++;
			} else if (arr[j] < 0) {
				neg++;
			} else {
				pos++;
			}
		}
		System.out.println(pos / n);
		System.out.println(neg / n);
		System.out.println(zero / n);
		in.close();
	}
}
