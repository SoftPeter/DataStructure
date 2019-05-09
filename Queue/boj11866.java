package Queue;

import java.io.*;
import java.util.*;

public class boj11866{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0, m =0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			q.addLast(i);
		}
		System.out.print("<");
		while(!q.isEmpty()) {
			cnt++;
			if(cnt%k == 0) {
				System.out.print(q.remove(m--));
				if(!q.isEmpty())
					System.out.print(", ");
			}
			if(m == q.size()-1) {
				m =0;
			} else {
				m++;
			}
		}
		System.out.print(">");
	}
}
