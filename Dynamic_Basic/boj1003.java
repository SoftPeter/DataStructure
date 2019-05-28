package Dynamic_Basic;

import java.util.*;

public class boj1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f[][] = new int[41][2];
		f[0][0] = 1;
		f[0][1] = 0;
		f[1][0] = 0;
		f[1][1] = 1;
		for(int i=2; i<41; i++) {
			for(int j=0; j<2; j++) {
				f[i][j] = f[i-2][j] + f[i-1][j];
			}
		}
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(f[n][0] + " " + f[n][1]);
		}
	}
}
