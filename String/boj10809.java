package String;

import java.util.*;

public class boj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int d[] = new int[26];
		for(int i=0; i<d.length; i++) {
			d[i] = -1;
		}
		for(int i=0; i<S.length(); i++) {
			int tmp = S.charAt(i)-'a';
			if(d[tmp] == -1) {
				d[tmp] = i;
			}
		}
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}
}
