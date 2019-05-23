package String;

import java.util.*;

public class boj2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] cArray = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<8; i++) {
			input = input.replaceAll(cArray[i], "*");
		}
		
		System.out.println(input.length());
	}
}

