
import java.util.*;

public class programmers_2_스킬트리 {

    static public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<Integer> location;
        
        
       for(int i=0; i<skill_trees.length; i++) {
    	   
    	   location = new ArrayList<Integer>();//한 스킬 트리 확인할 때 마다 초기화
       	   boolean check = false;
       	   String ski[] = skill_trees[i].split("");
       	   
       	   
        	for(int j=0; j<skill_trees[i].length(); j++) {

	        		
        		if(skill.contains(ski[j])) {
	        		location.add(skill.indexOf(ski[j]));	
        		}

        	}
        	
        	if(location.isEmpty())    
        		answer = answer +1;
        		
        	else {
        		
        		for(int k=0; k<location.size(); k++) {
        			
        			if(location.get(k) != k) {
        				check = true;
        				break;
        			}
        		}

        		if(check == false)
        			answer = answer +1;	
        		
        	}
        	

        }
        
        return answer;
    }
	
    
    public static void main(String[] args) {
		String skill = "CBD";
    	String s[] = {"BACDE"};
    	String sk[] = {"BACDE", "CBADF", "AECB", "BDA"};
    	
    	System.out.println(solution(skill,sk));
	}
    
	
}



