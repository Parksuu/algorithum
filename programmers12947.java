
public class programmers12947 {

	  static public boolean solution(int x) {
	      boolean answer = true;
	      
	      int realx = x;
	      int sum = 0;
	      int len = String.valueOf(x).length();
	      
	      for(int i=0;i<len;i++) {
	    	  sum = sum + (int)(x%10);
	    	  x = x/10;
	      }
	      
	      System.out.println(sum);
	      
	      if(realx%sum !=0)
	    	  answer=false;
	      
	      return answer;
	  }
	   
	  public static void main(String[] args) {
		
		  solution(11);
		  
	}
	
}
