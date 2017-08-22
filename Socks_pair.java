package easy;

import java.util.*;
public class Socks_pair {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pair = 0;
		HashSet<Integer> cn = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int pc = in.nextInt();
			if (cn.contains(pc)) {
				cn.remove(pc);
				pair++;
			} else {
				cn.add(pc);
			}
		}
		System.out.print(pair);
		in.close();
	}
}
