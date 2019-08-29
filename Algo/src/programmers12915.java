import java.util.*;

public class programmers12915 {

	  public String[] solution(String[] strings, int n) {
	      String[] answer = new String[strings.length];
	      
	      List<String> list = new LinkedList<>();
	      
	      for(int i=0;i<strings.length; i++) {
	    	  list.add(strings[i].charAt(n) + strings[i]);
	      }
	      
	      list.sort(null);
	      
	      for(int i=0;i<list.size(); i++)
	    	  answer[i] = list.get(i).substring(1,list.get(i).length());
	      
	      return answer;
	  }
	
}
