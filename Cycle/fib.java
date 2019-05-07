package Cycle;

import java.io.*;
public class fib {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	public static void main(String[] args) throws IOException{
		N = Integer.parseInt(br.readLine().trim());
		System.out.println(fibo(N));
	}
	private static int fibo(int n) {
		if(n == 0)	return 0;
		else if(n == 1)	return 1;
		else return (fibo(n-2) + fibo(n-1));
	}
}
