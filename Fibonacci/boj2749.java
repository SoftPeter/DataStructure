package Fibonacci;
//메모리 초과  
import java.util.*;
import java.io.*;

public class boj2749 {
	static long mod = 1000000;
	static long p = mod/10*15;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long d[] = new long[(int) (n+1)];
		d[0] = 0;
		d[1] = 1;
		for(int i=2; i<=n; i++) {
			d[i] = d[i-2] + d[i-1];
			d[i] %= mod;
		}
		System.out.println(d[(int) ((int) n%p)]);
	}
}
