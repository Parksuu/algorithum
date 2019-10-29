import java.util.*;

public class programmers_2_12939 {
	
	  public String solution(String s) {
	      String answer = "";
	      
	      String ar[] = s.split(" ");
	      int ir[] = new int[ar.length];
	      
	      for(int i=0;i<ir.length; i++)
	    	  ir[i] = Integer.parseInt(ar[i]);
	      
	      int max= ir[0], min=ir[0];
	      
	      for(int i=1; i<ir.length; i++) {
	    	  
	    	  if(max<ir[i])
	    		  max = ir[i];
	    	  
	    	  if(min>ir[i])
	    		  min = ir[i];
	    	  
	      }
	      
	      answer = min + " " + max;
	      
	      return answer;
	  }
}
