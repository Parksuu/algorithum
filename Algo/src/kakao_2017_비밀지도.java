import java.util.*;

public class kakao_2017_비밀지도 {
	  
	static public String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = new String[n];
	      
	      int x[][] = new int[n][n]; //0으로 초기화
	      int y[][] = new int[n][n]; //0으로 초기화
	      int xy[][] = new int[n][n];
	      
	      //1로 채워주기
	      for(int i=0;i<n; i++) {
	    	  int a = arr1[i];
	    	  int b = arr2[i];
	    	  
	    	  for(int j=0;j<n; j++) {
	    		  if( (a&(1<<j)) != 0) {
	    			  x[i][n-j-1] = 1;
	    		  }
	    		  
	    		  if( (b&(1<<j)) != 0) {
	    			  y[i][n-j-1] = 1;
	    		  }
	    	  }
	      }
	      
	      for(int i=0;i<n; i++) {
	    	  for(int j=0;j<n; j++) {
	    		  if(x[i][j] ==1 || y[i][j] ==1) 
	    			  xy[i][j] =1;
	    	  }
	      }
	      
	      for(int i=0;i<n;i++) {
	    	  answer[i] = "";
	      }
	      
	      for(int i=0;i<n; i++) {
	    	  for(int j=0;j<n;j++) {
	    		  if(xy[i][j] == 1)
	    			  answer[i] = answer[i] + "#";
	    		  else
	    			  answer[i] = answer[i] + " ";
	    	  }
	      }
	      
	      return answer;
	  }
	
	
	public static void main(String[] args) {
		
		int a[] = {9,20,28,18,11};
		int b[] = {30,1,21,17,28};
		
		String c[] = solution(5,a,b);
		
		for(int i=0;i<5;i++) {
			System.out.println(c[i]);
		}
	
	}
}
