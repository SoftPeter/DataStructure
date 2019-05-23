package FindRule;

import java.util.*;

public class boj2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 1;
		int roomnumber = 1;
		int add = 6;
		while(true) {
			if(n <= roomnumber)
				break;
			roomnumber += add;
			add += 6;
			ans++;
		}
		System.out.println(ans);
	}
}
