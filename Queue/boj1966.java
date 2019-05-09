package Queue;

import java.io.*;
import java.util.*;

class Node {
	int index;
	int priority;
	Node(int index, int priority){
		this.index = index;
		this.priority = priority;
	}
}

public class boj1966{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			LinkedList<Node> q = new LinkedList<Node>();
			for(int i=0; i<n; i++) {
				q.addLast(new Node(i, sc.nextInt()));
			}
			int count = 0;
			
			while(!q.isEmpty()) {
				Node node = q.remove();
				boolean c = true;
				for(Node i : q) {
					if(node.priority < i.priority)
						c = false;
				}
				if(c) {
					count++;
					if(node.index == m)
						break;
				}
				else
					q.addLast(node);
			}
			System.out.println(count);
		}
	}
}
