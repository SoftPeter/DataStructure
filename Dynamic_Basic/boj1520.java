package Dynamic_Basic;

import java.util.*;

public class boj1520 {
	//세로 = 높이  
	static int m ;
	//가로 = 너비
	static int n;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int map[][];
	static int d[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[m][n];
		d = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
				d[i][j] = -1;
			}
		}
		System.out.println(dfs(m-1,n-1));
	}
	
	private static int dfs(int x, int y) {
		if(x==0 && y==0)
			return 1;
		
		if(d[x][y] == -1) {
			d[x][y] = 0;
			for(int i=0; i<dx.length; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(0<=nx && nx<m && 0<=ny && ny<n) {
					if(map[x][y] < map[nx][ny])
						d[x][y] += dfs(nx, ny);
				}
			}
		}
		return d[x][y];
	}
}

