package Sort;

import java.io.*;
import java.util.*;

public class boj10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int d[] = new int[10001];
		for(int i=0; i<N; i++) {
			d[Integer.parseInt(br.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=10000; i++) {
			if(d[i] > 0) {
				for(int j=0; j<d[i]; j++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}
		br.close();
		bw.close();
		
	}
}
