import java.util.*;


public class programmers_3_네트워크{

	static int computer[][];
	static boolean visited[];
	static int answer = 0;
	static int nn;
	
	static void dfs(int a[][], int idx) {
		visited[idx] = true; //idx 방문

		for(int i=0; i<nn; i++) { //idx에 연결돼있는 0~size까지 돌면서 true로 만든다
			if(a[idx][i] ==1 && visited[i] ==false)
				dfs(a,i);
		}
		
	}
	
    static public int solution(int n, int[][] computers) {
    	computer = computers;
    	visited = new boolean[n];
    	nn = n;
    	for(int i=0;i<n;i++) {
    		if(visited[i] == false) {
    			dfs(computer,i); //한번 돌고 나올 때 마다 연결 되어있는 애들 다 true 체크해서 나오니까 
    			answer++; //그 때 마마다 answer +1 해준다
    		}
    	}
        return answer;
    }
	
	
	public static void main(String[] args) {
		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println("답 " +solution(3,a));
	}
}