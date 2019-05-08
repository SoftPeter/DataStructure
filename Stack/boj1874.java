package Stack;
import java.util.*;
import java.io.*;

public class boj1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().trim());
		int max = 0;
		int ar[] = new int[N];
		int top = 0;
		while(N-- > 0) {
			int k = Integer.parseInt(br.readLine().trim());
			if(k > max) {
				for(int i=max+1; i<=k; i++) {
					ar[top++] = i;
					sb.append("+\n");
				}
				max = k;
			}
			else if(ar[top-1] != k){
				System.out.println("NO");
				return;
			}
			top--;
			sb.append("-\n");
		}
		System.out.println(sb);
	}
}
