
//@@@@@@@@@@@@@@@@@@2
// 다시 풀어보기@
public class programmers_2_12899 {

	
	  public String solution(int n) {
	      String answer = "";
	      
	      int m = 0;
	      
	      while(n>0) {
	    	  m = n%m;
	    	  n = n/3;
	    	  
	    	  if(m==0) {
	    		  n = n-1;
	    		  m = 4;
	    	  }
	    	  
	    	  answer = m + answer;
	      }
	      
	      
	      return answer;
	  }
	
	  
	public static void main(String[] args) {
		
		
	}
}
