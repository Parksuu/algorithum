
public class programmers12926 {

	
	  static public String solution(String s, int n) {
	      String answer = "";
	      
	      n = n%26;
	      
	      for(int i=0;i<s.length(); i++){
	    	  char c = s.charAt(i);
	    	  
	    	  if(Character.isLowerCase(c)) 
	    		  c = (char) ((c-'a' + n)%26 + 'a');
	    	  else if(Character.isUpperCase(c))
	    		  c = (char) ((c-'A' + n)%26 + 'A');
	    	  
	    	  //else는 ' '인 경우
	    	  answer = answer + c;
	      }
	      
	      
	      return answer;
	  }
	
	public static void main(String[] args) {

		String s = "abb";
		
		s = s + 'c';
		
		System.out.println(s);
	}
	
	
}