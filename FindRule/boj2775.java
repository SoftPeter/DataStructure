package FindRule;

import java.util.*;

public class boj2775 {
	public static void main(String[] args) {
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String Day_Week[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		int tm = 0;
		for(int i=0; i<m-1; i++) {
			tm += day[i];
		}
		int today = (tm+d-1)%7;
		
		System.out.println(Day_Week[today]);
	}
}