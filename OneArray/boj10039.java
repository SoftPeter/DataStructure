package OneArray;

import java.util.*;
import java.io.*;

public class boj10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d[] = new int[5];
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			if(n < 40) {
				d[i] = 40;
			}
			else {
				d[i] = n;
			}
		}
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + d[i];
		}
		System.out.println(sum/5);
	}
}
