import java.util.*;

public class programmers_2_피보나치수 {

	
//	 static public int fib(int n){
//	      if(n < 2)
//	          return n;
//	      else
//	    	  return (fib(n-1)%1234567 + fib(n-2)%1234567)%1234567;
//	  }
//	    
//	  static public int solution(int n) {
//	      
//	      int answer = fib(n)%1234567;
//	      return answer;
//	  }
	
	
	static public int solution(int n) {
		int a=0,b=1;
		
		for(int i=0;i<n;i++) {
			int c = (a+b)%1234567;
			a = b%1234567;
			b = c%1234567;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(solution(5));
	}
}
