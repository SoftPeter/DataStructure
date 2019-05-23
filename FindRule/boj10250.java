package FindRule;

import java.util.*;

public class boj10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int i = n/h;
			int k = n%h;
			
			if(k==0) {
				int ans = h*100 + i;
				System.out.println(ans);
			}
			else {
				int ans = k*100 + i + 1;
				System.out.println(ans);
			}
		}
	}
}
