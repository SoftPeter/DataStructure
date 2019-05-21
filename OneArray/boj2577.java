package OneArray;

import java.util.*;
import java.io.*;

public class boj2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Sum = A*B*C;
		int d[] = new int[10];
		
		String s = String.valueOf(Sum);
		
		for(int i=0; i<s.length(); i++) {
			d[s.charAt(i) - '0']++;
		}
		
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
	}
}
