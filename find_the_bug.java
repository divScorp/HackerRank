package easy;

import java.util.*;

public class find_the_bug {

	static int[] findTheBug(String[] grid) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] r = new int[n];
		in.close();
		return r;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] grid = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		// Return an array containing [r, c]
		int[] result = findTheBug(grid);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
		}
		System.out.println("");
		in.close();
	}
}