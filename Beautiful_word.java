package easy;

import java.util.*;

public class Beautiful_word {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		boolean b = false;
		// int j=0,c=0;
		char[] vow = { 'a', 'e', 'i', 'o', 'u', 'y' };

		for (int i = 0; i < w.length(); i++) {
			if (w.charAt(i) != w.charAt(i + 1)) {
				for (int j = 0; j < 6; j++)
					if (w.charAt(i) == vow[j]) {
						j = 0;
						if ((w.charAt(i + 1) == vow[j]) && (j < 6)) {
							j++;
							b = true;
						}
					}
			}
		}
		if (b == true) {
			System.out.println("no");
		} else {
			System.out.println("Yes");
		}
		// Print 'Yes' if the word is beautiful or 'No' if it is not.
		in.close();
	}
}