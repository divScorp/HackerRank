package easy;

import java.util.*;

public class Fight_the_monster {

	static int getMaxMonsters(int n, int hit, int t, int[] h) {
		int count = 0, c = 0;
		Arrays.sort(h);
		for (int i = 0; i < t && count <= t; i++) {

			while (h[i] <= 0) {
				h[i] = h[i] - hit;
				count++;
			}
			c++;
		}
		// for(int j=0;j<n;j++){
		// if(h[j]<=0)
		// c++;
		// }
		return c;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int hit = in.nextInt();
		int t = in.nextInt();
		int[] h = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		int result = getMaxMonsters(n, hit, t, h);
		System.out.println(result);
		in.close();
	}
}
