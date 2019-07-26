class Solution {
	  public String solution(String[] seoul) {
	      String answer = "김서방은 ";
	      String answer1="";
	      String answer2 = "에 있다";
	      
	      for(int i=0;i<seoul.length;i++) {
	    	  if(seoul[i].equals("Kim"))
	    		  answer1 = Integer.toString(i);
	      }
	      
	      String t1 = answer.concat(answer1);
	      String t2 = t1.concat(answer2);
	      
	      return t2;
	      
	  }
}
