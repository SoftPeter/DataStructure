package Tree;

import java.io.*;
import java.util.Scanner;

public class boj1991 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[26][2];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			int p = s.charAt(0) - 'A';
			int c1 = s.charAt(2);
			int c2 = s.charAt(4);
			if(c1 == '.')
				a[p][0] = -1;
			else
				a[p][0] = c1 - 'A';
			
			if(c2 == '.')
				a[p][1] = -1;
			else
				a[p][1] = c2 - 'A';
		}
		
		preorder(a,0);
		System.out.println();
		inorder(a,0);
		System.out.println();
		postorder(a,0);
	}
	private static void preorder(int[][] a, int i) {
		// TODO Auto-generated method stub
		if(i == -1)
			return;
		System.out.print((char)(i + 'A'));
		preorder(a, a[i][0]);
		preorder(a, a[i][1]);
	}
	private static void inorder(int[][] a, int i) {
		// TODO Auto-generated method stub
		if(i == -1)
			return;
		inorder(a, a[i][0]);
		System.out.print((char)(i + 'A'));
		inorder(a, a[i][1]);
	}
	private static void postorder(int[][] a, int i) {
		// TODO Auto-generated method stub
		if(i == -1)
			return;
		postorder(a, a[i][0]);
		postorder(a, a[i][1]);
		System.out.print((char)(i + 'A'));
	}
}
