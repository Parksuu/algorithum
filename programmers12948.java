
public class programmers12948 {

	  public String solution(String phone_number) {
	      String answer = "";
	      
	      int size = phone_number.length();
	      
	      String st1 = phone_number.substring(size-4, size);
	      String st2="";
	      
	      for(int i=0;i<size-4;i++) 
	    	  st2 = st2+ "*";
	      
	      answer = st2+st1;
	      
	      return answer;
	  }
	
	  
	public static void main(String args[]) {
		
	}
}
