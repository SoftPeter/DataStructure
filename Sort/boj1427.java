package Sort;

import java.io.*;
import java.util.*;

public class boj1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i=0; i<N.length(); i++) {
			d.add((int) N.charAt(i));
		}
		Collections.sort(d, Collections.reverseOrder());
		for(int i=0; i<N.length(); i++) {
			System.out.print(d.get(i) - '0');
		}
	}
}
