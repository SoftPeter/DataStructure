package String;

import java.util.*;

public class boj2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int new_A = 0;
		int new_B = 0;
		new_A = (A%10)*100 + ((A%100)/10)*10 + (A/100);
		new_B = (B%10)*100 + ((B%100)/10)*10 + (B/100);
		
		if(new_A < new_B)
			System.out.println(new_B);
		else
			System.out.println(new_A);
	}
}
