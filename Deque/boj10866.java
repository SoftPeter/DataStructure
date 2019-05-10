package Deque;

import java.util.*;

public class boj10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> q = new LinkedList<>();
		int t = sc.nextInt();
		while(t-- > 0) {
			String input = sc.next();
			if(input.equals("push_front")) {
				q.addFirst(sc.nextInt());
			}
			else if(input.equals("push_back")) {
				q.addLast(sc.nextInt());
			}
			else if(input.equals("pop_front")) {
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.removeFirst());
			}
			else if(input.equals("pop_back")) {
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.removeLast());
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
					System.out.println(q.peekFirst());
			}
			else if(input.equals("back")) {
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.peekLast());
			}
		}
	}
}
