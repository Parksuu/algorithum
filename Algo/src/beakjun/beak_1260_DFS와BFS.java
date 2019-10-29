import java.util.*;
import java.io.*;

public class Main {

	static int a[][]; 
	static boolean c[];
	
	static boolean visited[];
	static Queue qu = new LinkedList<Integer>();
	
	public static void dfs(int a[][], boolean c[], int v) {
		
		c[v] = true; //v도 방문한거니까 true
		System.out.print(v + " ");
		
		for(int i=1; i<a.length; i++) { //v의 행을 쫙 돌면서 1인걸 확인한다.
			if(a[v][i]==1 && c[i]==false) {
				
				//끝까지 가서 없으면 재귀를 타고 올라와서 남은 vertex에 남은 인접 vertex가 있나 찾아본다
				dfs(a,c,i); //분기를 다 돌아야하니까 찾은 i를 dfs 해서 i의 인접한 행렬을 찾는다
			}
		}
	}
	
	public static void bfs(int a[][],boolean visited[], int v) {
		qu.offer(v); //들어온 값을 큐에 넣고
		visited[v]=true; //방문했으니까 true로 만들고
		
		while(!qu.isEmpty()) { //큐가 empty가 아닌동안 돈다
			v = (int) qu.poll(); //꺼내고
			System.out.print(v + " ");
			
			for(int i=1; i<a.length; i++) {
				if(a[v][i]==1 && visited[i]==false) {
					qu.offer(i);
					visited[i]=true;// 중복이 안되게 하기위해서
				}
			}
			
		}
	}
	
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();		int e = sc.nextInt();		int s = sc.nextInt();
		
		a = new int[v+1][v+1]; //size 정해주기
		
		c = new boolean[v+1]; //c는 vertex개수만큼 만들기
		visited = new boolean[v+1];
		
		//edge 개수만큼 a행렬에 넣어주기
		for(int i=1; i<=e; i++) {
			int n1 = sc.nextInt(); int n2 = sc.nextInt();
			a[n1][n2] = 1;
			a[n2][n1] = 1;
		}
		
		//방문 안한 것들 c 전부 false로 만들어놓기
		for(int i=0; i<v+1; i++) {
			c[i] = false;
			visited[i] = false;
		}
		
		//이렇게 맞춰놓고 dfs 시작
		
		dfs(a,c,s);
		System.out.println("");
		bfs(a,visited,s);
		
	}//main
}
