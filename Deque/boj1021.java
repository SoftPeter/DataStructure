package Deque;

import java.util.*;
import java.io.*;
public class boj1021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		String[] num = br.readLine().split(" ");
		int n = Integer.parseInt(number.split(" ")[0]);
		int m = Integer.parseInt(number.split(" ")[1]);
		LinkedList<Integer> q = new LinkedList<>();
		int ar[] = new int[num.length];
		
		for(int i=0; i<num.length; i++) {
			ar[i] = Integer.parseInt(num[i]);
		}
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		int cnt=0, half=0;
		for(int i=0; i<ar.length; i++) {
			if(q.size() % 2 == 0)
				half = ((q.size() / 2) - 1);
			else
				half = q.size() / 2;
			
			int s=0;
			for(int j=0; j<q.size(); j++) {
				if(q.get(j) == ar[i]) {
					s=j;
					break;
				}
			}
			
			if(half - s >= 0) {
				for(int j=0; j<s; j++) {
					q.addLast(q.removeFirst());
					cnt++;
				}
				q.remove();
			}
			else {
				for(int j=0; j<q.size()-s; j++) {
					q.addFirst(q.removeLast());
					cnt++;
				}
				q.remove();
			}
		}
		System.out.println(cnt);
		
	}
}
