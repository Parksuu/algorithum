
public class programmers12943 {
	  
	public int solution(long num) {
	      int answer = 0;
	      int cnt = 0;
	      
	      while(num!=1) {
	    	  
	    	  if(cnt>=500)
	    		  break;
	    	  
	    	  
	    	  if(num%2 ==0)
	    		  num = num/2;
	    	  else
	    		  num = (num*3) + 1;
	    	  
	    	  cnt++;
	      }
	      
	      if(cnt!=500)
	    	  answer = cnt;
	      else
	    	  answer = -1;
	      
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		
	}
}
