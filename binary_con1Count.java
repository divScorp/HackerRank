package easy;

import java.util.*;

public class binary_con1Count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int reminder = 0, count = 0, res = 0;
		while (n > 0) {
			reminder = n % 2;
			n = (int) n / 2;
			if (reminder == 1) {
				count++;
				if (count >= res)
					res = count;
			} else {
				count = 0;
			}

		}
		System.out.println(res);
		in.close();
	}
}
