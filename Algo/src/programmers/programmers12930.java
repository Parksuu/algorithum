
//콜론의 사용법 익히기!!

public class programmers12930 {

	  public String solution(String s) {
	      String answer = "";
	      int cnt = 0;
	      String ar[] = s.split("");
	      
	      for(String ss : ar) { //콜론의 사용!
	    	  if(ss.contains(" "))
	    		  cnt=0;
	    	  else
	    		  cnt =cnt + 1;
	    	  
	    	  if(cnt%2 ==0)
	    		  answer = answer + ss.toLowerCase();
	    	  else
	    		  answer = answer + ss.toUpperCase();
	    	  
	      }
	      
	     
	      return answer;
	  }
	
	
}
