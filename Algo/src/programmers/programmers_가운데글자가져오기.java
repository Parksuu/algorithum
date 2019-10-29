class Solution {
	public String solution(String s) {
	      String answer = "";
	      
	     int size = s.length();
	      
	      if(size%2==0) {
	    	  int num = size/2-1;
	    	  char a = s.charAt(num);
	    	  char b = s.charAt(num+1);
	    	  
	    	  String aa = String.valueOf(a);
	    	  String bb = String.valueOf(b);
	    	  
	    	  answer = aa + bb;
	      }
	      
	      else {
	    	  int num = size/2;
	    	  char a = s.charAt(num);
	    	  
	    	  String aa = String.valueOf(a);
	    	  
	    	  answer = aa;
	      }
	      
	      return answer;
	  }
	
}
