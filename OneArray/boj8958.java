package OneArray;

import java.util.*;
import java.io.*;

public class boj8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int[] score = new int[T];
		int[] sum = new int[T];
		
		for(int t=0; t<T; t++) {
			String input = sc.nextLine();
			int[] d = new int[input.length()];
			
			for(int i=0; i<input.length(); i++) {
				d[i] = input.charAt(i);
				if(d[i] == 'O') {
					score[t]++;
					sum[t] = sum[t] + score[t];
				} else {
					score[t] = 0;
				}
			}
			
			System.out.println(sum[t]);
		}
	}
}
