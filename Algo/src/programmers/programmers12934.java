import java.math.*;


public class programmers12934 {

	  public long solution(long n) {
	    long answer = 0;
	    
	    double x =  Math.sqrt(n);
	    
	    int num = (int)x;
	    
	    if(x == num)
	    	answer=(long)Math.pow(num+1, 2);
	    else
	    	answer = -1;
	    
	    
	    return answer;
	  }
	  
	  public static void main(String[] args) {
		
	}
}
