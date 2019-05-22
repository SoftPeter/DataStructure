package String;

import java.util.*;

public class boj1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tnum = t;
		while(t-- > 0) {
			boolean c[] = new boolean[26];
			String s = sc.next();
			c[s.charAt(0) - 'a'] = true;
			for(int i=1; i<s.length(); i++) {
				if(s.charAt(i-1) != s.charAt(i)) {
					if(c[s.charAt(i) - 'a'] == true) {
						tnum--;
						break;
					}
					c[s.charAt(i) - 'a'] = true;
				} 
			}
		}
		System.out.println(tnum);
	}
}
