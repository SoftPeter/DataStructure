package String;

import java.util.*;

public class boj1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int d[] = new int[26];
		s = s.toUpperCase();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				d[s.charAt(i) - 'A']++;
			}
		}
		
		int max=0;
		int index=0;
		for(int i=0; i<26; i++) {
			if(max < d[i]) {
				max = d[i];
				index = i;
			}
		}
		
		int flag = 0;
		for(int i=0; i<26; i++) {
			if(index != i && max == d[i])
				flag = -1;
		}
		
		if(flag==-1)
			System.out.println("?");
		else
			System.out.println((char)(index +'A'));
	}
}
