package Dynamic_Basic;

import java.util.*;

public class boj9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long p[] = new long[101];
		
		while(t-- > 0) {
			int n = sc.nextInt();
			p[1] = 1;
			p[2] = 1;
			p[3] = 1;
			p[4] = 2;
			p[5] = 2;
			for(int i=6; i<=n; i++) {
				p[i] = p[i-1] + p[i-5];
			}
			System.out.println(p[n]);
		}
	}
}

