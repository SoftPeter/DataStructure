package FindRule;

import java.util.*;

public class boj2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d[][] = new int[15][16];
		
		for(int i=0; i<=14; i++) {
			d[i][1] = 1;
			d[0][i+1] = i+1; 
		}
		
		while(t-- > 0) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			for(int i=1; i<=k; i++) {
				for(int j=1; j<=n; j++) {
					d[i][j] = d[i][j-1] + d[i-1][j];
				}
			}
			System.out.println(d[k][n]);
		}
	}
}