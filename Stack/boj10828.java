package Stack;
import java.util.*;

public class boj10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ar[] = new int[t];
		int top = -1;
		String str;
		while(t-- > 0) {
			str = sc.next();
			if(str.equals("push")) {
				top++;
				ar[top] = sc.nextInt();
			}
			
			else if(str.equals("pop")) {
				if(top == -1)
					System.out.println(-1);
				else {
					System.out.println(ar[top]);
					top--;
				}
			}
			
			else if(str.equals("size")) {
				System.out.println(top+1);
			}
			
			else if(str.equals("empty")) {
				if(top == -1)
					System.out.println(1);
				else
					System.out.println(0);
			}
			
			else if(str.equals("top")) {
				if(top == -1)
					System.out.println(-1);
				else
					System.out.println(ar[top]);
			}
		}
	}
}
