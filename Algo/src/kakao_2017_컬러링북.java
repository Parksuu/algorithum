import java.util.*;


public class kakao_2017_컬러링북 {
	
	static class Pos{
		int x;
		int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	

	  static public int[] solution(int m, int n, int[][] picture) {
	      int numberOfArea = 0;
	      int maxSizeOfOneArea = 0;
	      
	      int mx[] = {-1, 0, 1, 0};
	      int my[] = { 0, 1, 0,-1};
	      
	      int[] answer = new int[2];
	      
	      int visited[][] = new int[m][n]; //전부 0으로 초기화하고, 방문했으면 그 숫자들로 채운다
	      
	      Queue<Pos> pos = new LinkedList<Pos>();
	      
	      //while들어가기 전
	      for(int i=0;i<m; i++) {
	    	  for(int j=0; j<n; j++) {
	    		  
	    		  if(picture[i][j] != 0 && visited[i][j] ==0) {
	    			  numberOfArea++; //영역 하나 찾은거니까
	    			  int nowOneArea = 0; //nowOneArea에 현재 영역의 크기를 넣어주고 maxSizeOfOneArea와 비교함
	    			  
	    			  visited[i][j] = picture[i][j]; //채워주고
	    			  pos.add(new Pos(i,j)); //qu에 넣어주고
	    			  
	    			  //영역 하나가 다 끝날 때까지 돈다
	    			  while(!pos.isEmpty()) {
	    				  // 1)head 빼내서
	    				  Pos now = pos.poll();
	    				  nowOneArea++; //qu에서 빼낼 때 마다 영역 추가 &
	    				  
	    				  // 2)bfs - 네면 비교해서 같은 숫자이면서 visited하지 않은 곳을 큐에 쌓는다
	    				  // for 다 돌아서 갈 곳이 없으면 쌓지않고 while돌면서 poll만 한다
	    				  for(int k=0; k<4; k++) {
	    					  int xx = now.x + mx[k];
	    					  int yy = now.y + my[k];
	    					  
	    					  if(xx<0 || yy<0 || xx>=m || yy>=n)//이동한 위치가  컬러링 밖으로 나가면
	    						  continue;
	    					  if(visited[xx][yy] !=0 || picture[xx][yy] ==0)//이동한 위치가 방문한곳이거나, 이동한 위치의 picture가 0이면
	    						  continue;
	    					  if(picture[xx][yy] != picture[now.x][now.y]) //poll한 곳의 숫자와 이동한 곳의 숫자가 다르다면
	    						  continue;
	    					  
	    					  //저 위가 다 아니라면 내 영역
	    					  visited[xx][yy] = picture[xx][yy]; //이동된visited를 picture 숫자로 칠해주고
	    					  pos.add(new Pos(xx,yy));
	    				  }

	    			  }//while
	    			  
	    			  maxSizeOfOneArea = Math.max(maxSizeOfOneArea, nowOneArea); // 현재 영역과 max영역 비교해서 큰값을 max에 넣는다
	    		  }//if
	    		  
	    	  }//for
	      }//for
	      
	      answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
	    		  
	      return answer;
	  }
	
	
	public static void main(String[] args) {
		
		int a[] = new int[2];
		int pic[][] =  {{1,1,1,0},
						{1,2,2,0},
						{1,0,0,1},
						{0,0,0,1},
						{0,0,0,3},
						{0,0,0,3}};
		
		a = solution(6,4,pic);
		
		for(int i=0;i<2; i++) {
			System.out.println(a[i]);
		}		
	}
}