package FindRule;

import java.util.*;

public class boj1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		int line = 1;
		
		while(true) {
			if(sum >= n)
				break;
			line++;
			sum += line;
		}
		
		int child=0, parent=0;
		
		if(line%2 == 0) {
			int sub = sum-n;
			child = line-sub;
			parent = 1+sub;
		}
		if(line%2 == 1) {
			int sub = sum-n;
			child = 1+sub;
			parent = line-sub;
		}
		
		System.out.println(child + "/" + parent);
	}
}
