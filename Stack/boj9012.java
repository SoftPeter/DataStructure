package Stack;
import java.util.*;
import java.io.*;

public class boj9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		String res = "YES";
		while(T-- > 0) {
			String str = br.readLine();
			Stack<Integer> stack = new Stack<Integer>();
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == '(') {
					stack.push(1);
					res = "YES";
				}
				else if(str.charAt(i) == ')') {
					if(stack.isEmpty()) {
						res = "NO";
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty())
				res = "NO";
			System.out.println(res);
		}
	}
}
