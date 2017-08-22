package easy;

import java.util.*;

public class St_even_odd {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String st;
		for (int i = 0; i < n; i++) {
			st = in.next();
			for (int k = 0; k < st.length(); k++) {
				if (k % 2 == 0)
					System.out.print(st.charAt(k));
			}
			System.out.print(" ");
			for (int k = 0; k < st.length(); k++) {
				if (k % 2 == 1)
					System.out.print(st.charAt(k));
			}
		}
		System.out.println();
		in.close();
	}
}