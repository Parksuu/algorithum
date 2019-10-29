package naver_ct;

import java.util.*;

public class naver_3{
	
	   public static int[] solution(int[] cook_times, int[][]order, int k) {
	       int size=cook_times.length;
	       int visited[]=new int[size]; //최소 몇번 갔는지
	       int min_list[]=new int[size]; //최소 몇초
	       
	       for(int i=0;i<size;i++) {
	          min_list[i]=cook_times[i]; //일단 각 초들 다 저장
	          visited[i]=0; // 방문은 전부 0으로
	       }
	       
	       int end=order.length;
	       
	       for(int i=0;i<end;i++) {
	          int pre=order[i][0]-1; //먼저 수행해야하는 곳
	          int now=order[i][1]-1; //현재 수행하는 곳
	          
	          if(visited[pre]==0) //먼저수행해야 하는곳을 안갔다왔다면
	        	  visited[now]= visited[now]+1; // visited에 현재가야하는 곳에 +1
	          else
	        	  visited[now]= visited[now]+visited[pre];
	          
	          int num=cook_times[now]+min_list[pre]; //전까지의초 + 현재수행한느곳의 초
	          
	          if(min_list[now]==cook_times[now]) 
	        	  min_list[now]=num;
	          else if(min_list[now]<num)
	        	  min_list[now]=num;
	          
	       }
	       
	      int answer[] = new int[2];
	      answer[0]=visited[k-1]; //5단계를 를 알기 위해서는 visited[4]; 배열에는 0,1,2,3,4순이니까
	      answer[1]=min_list[k-1];
	         
	       return answer;
	   }
	
	
	
	public static void main(String args[]) {
		

	}
	
}
