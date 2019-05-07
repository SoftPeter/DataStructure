package Cycle;

import java.io.*;

public class hanoi {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	public static void main(String[] args) throws IOException{
		N = Integer.parseInt(br.readLine());
		hanoi(N, 'A', 'B', 'C');
	}
	private static void hanoi(int n, char from, char tmp, char to) {
		if(n == 1)
			System.out.println("원판" + n + "번째를 " + from + "->" + to);
		else {
			hanoi(n-1, from, to, tmp);
			System.out.println("원판" + n + "번째를 " + from + "->" + to);
			hanoi(n-1, tmp, from, to);
		}
	}
}
