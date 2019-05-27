package Sort;

import java.io.*;
import java.util.*;

public class boj1181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s[] = new String[t];

		for(int i=0; i<t; i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s);
		
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		System.out.println(s[0]);
		for(int i=1; i<t; i++) {
			if(!s[i].equals(s[i-1]))
				System.out.println(s[i]);
		}
	}
}
