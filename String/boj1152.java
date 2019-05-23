package String;

import java.util.*;

public class boj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] s = input.split(" ");
		if(input.isEmpty())
			System.out.println(0);
		else
			System.out.println(s.length);
	}
}
