package OneArray;

import java.util.*;
import java.io.*;

public class boj2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[8];
		for(int i=0; i<d.length; i++) {
			d[i] = sc.nextInt();
		}
		String output = "";
		for(int i=0; i<d.length-1; i++) {
			if(d[i] == (d[i+1]-1)) {
				output = "ascending";
			}
			else if(d[i] == (d[i+1]+1)) {
				output = "descending";
			}
			else {
				output = "mixed";
				break;
			}
		}
		System.out.println(output);
	}
}
