package Dynamic_Basic;

import java.util.*;

public class boj10844 {
	final static int div = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[][] = new long[n+1][11];
		
		for(int i=1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				d[i][j] = 0;
				if(j-1 >= 0)	d[i][j] += d[i-1][j-1];
				if(j+1 <= 9)	d[i][j] += d[i-1][j+1];
				d[i][j] %= div;
			}
		}
		
		long ans = 0;
		for(int i=0; i<=9; i++) {
			ans += d[n][i];
		}
		ans %= div;
		System.out.println(ans);
	}
}
