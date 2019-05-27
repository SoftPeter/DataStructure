package Sort;

import java.io.*;
import java.util.*;

public class boj2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			d.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(d);
		for(int i=0; i<N; i++) {
			System.out.println(d.get(i));
		}
	}
}
