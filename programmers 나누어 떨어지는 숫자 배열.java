import java.util.*;

class Solution {
	  static public int[] solution(int[] arr, int divisor) {
	      int answer [] = null;
	      
	      ArrayList <Integer> list = new ArrayList();
	      
	      for(int i=0;i<arr.length;i++) {
	    	  
	    	  if(arr[i] % divisor == 0)
	    		  list.add(arr[i]);
	    	  
	      }
	      
	      list.sort(null);
	      
	      if(list.isEmpty() == true){
	    	  answer = new int[1];
	    	  answer[0] = -1;
	      }
	      
	      else {
	    	  answer = new int[list.size()];
	    	  for(int i=0; i<list.size(); i++) {
	    		  answer[i] = (int) list.get(i);
	    	  }
	      }

	      return answer;
	  }
}
