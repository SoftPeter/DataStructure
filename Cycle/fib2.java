package Cycle;

import java.io.*;
public class fib2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	public static void main(String[] args) throws IOException{
		N = Integer.parseInt(br.readLine().trim());
		System.out.println(fibo2(N));
	}
	private static int fibo2(int n) {
		if(n < 2)	return n;
		else {
			int tmp, last = 0;
			int current = 1;
			for(int i=2; i<=n; i++) {
				tmp = current;
				current += last;
				last = tmp;
			}
			return current;
		}
	}
}
