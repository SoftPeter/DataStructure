package String;

import java.util.*;

public class boj5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int time=0;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if('A'<= c && c <= 'C')
				time +=3;
			if('D'<= c && c <= 'F')
				time +=4;
			if('G'<= c && c <= 'I')
				time +=5;
			if('J'<= c && c <= 'L')
				time +=6;
			if('M'<= c && c <= 'O')
				time +=7;
			if('P'<= c && c <= 'S')
				time +=8;
			if('T'<= c && c <= 'V')
				time +=9;
			if('W'<= c && c <= 'Z')
				time +=10;
		}
		System.out.println(time);
	}
}
