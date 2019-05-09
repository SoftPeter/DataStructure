package Queue;

import java.io.*;
import java.util.*;

public class boj10845{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		int N = sc.nextInt();
		while(N-- > 0) {
			String input = sc.next();
			if(input.equals("push")) {
				q.add(sc.nextInt());
			}
			
			else if(input.equals("pop")) {
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.poll());
			}
			
			else if(input.equals("size")) {
				System.out.println(q.size());
			}
			
			else if(input.equals("empty")) {
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			
			else if(input.equals("front")) {
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.peek());
			}
			
			else if(input.equals("back")) {
				if(q.isEmpty())
					System.out.println(-1);
				else {
					Object[] tmp = q.toArray();
					System.out.println(tmp[tmp.length-1]);
				}
			}
		}
		sc.close();
	}
}
