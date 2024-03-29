import java.util.*;

public class beak_2667_단지번호붙이기 {
	static class Pos{
		int x;
		int y;
		
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][n]; //arr[0][0] ~ arr[n-1][n-1]
		int visited[][] = new int[n][n]; //visited[0][0] ~ visited[n-1][n-1]
		
		int allsize = 0;
		ArrayList<Integer> onesize = new ArrayList<Integer>();
		Queue<Pos> qu = new LinkedList<Pos>();
		
		int dx[] = {1, -1, 0,  0};
		int dy[] = {0,  0, 1, -1};
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0;j<n;j++) {
				arr[i][j] = s.charAt(j) - 48;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//일단 1이 아닌 곳부터 찾는다
				if(arr[i][j] == 1 && visited[i][j] == 0) {
					allsize++;
					visited[i][j] = 1; //방문했으니까
					qu.add(new Pos(i,j));
				}
				else
					continue;
				
				int a = 1;
				
				while(!qu.isEmpty()) {
					Pos now = qu.poll();
					
					for(int k=0; k<4; k++) {
						int xx = now.x + dx[k];
						int yy = now.y + dy[k];
						
						if(xx<0 || yy <0 || xx>=n || yy>=n)
							continue;
						if(visited[xx][yy] ==1 || arr[xx][yy] == 0)
							continue;
						
						//위가 다 아니라면
						qu.add(new Pos(xx,yy));
						visited[xx][yy]=1;
						a++;
					}
					
				}//while
				onesize.add(a);
			}
		}//바깥 for
		
		onesize.sort(null);
		
		System.out.println(allsize);
		
		for(int i=0; i<onesize.size();i++) 
			System.out.println(onesize.get(i));
		
		
	}//main
}