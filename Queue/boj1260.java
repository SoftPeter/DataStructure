package Queue;

import java.io.*;
import java.util.*;

public class boj1260{
	static ArrayList<Integer> a[];
	static boolean c[];
	private static void dfs(int x) {
		if(c[x])
			return;
		c[x] = true;
		System.out.print(x + " ");
		for(int y : a[x]) {
			if(c[y] == false)
				dfs(y);
		}
	}
	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		c[x] = true;
		while(!q.isEmpty()) {
			int i = q.remove();
			System.out.print(i + " ");
			for(int y : a[i]) {
				if(c[y] == false) {
					c[y] = true;
					q.add(y);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		a = (ArrayList<Integer> []) new ArrayList[n+1];
		for(int i=0; i<m; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
		}
		for(int i=1; i<=n; i++) {
			Collections.sort(a[i]);
		}
		c = new boolean[n+1];
		dfs(start);
		System.out.println();
		c = new boolean[n+1];
		bfs(start);
	}
}
