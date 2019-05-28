package Dynamic_Basic;

import java.util.*;

public class boj1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c[][] = new int[t][3];
		int d[][] = new int[t][3];
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		
		d[0][0] = c[0][0];
		d[0][1] = c[0][1];
		d[0][2] = c[0][2];
		
		for(int i=1; i<t; i++) {
			d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + c[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + c[i][1];
			d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + c[i][2];
		}
		
		int min = Math.min(Math.min(d[t-1][0], d[t-1][1]), d[t-1][2]);
		System.out.println(min);
	}
}
