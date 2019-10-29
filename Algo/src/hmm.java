import java.util.*;

//스킬트리
class hmm{
	
    public int solution(String skill, String[] skill_trees) {
        String skills[] = skill.split("");
    	int answer = 0;
    	
        for(int i=0;i<skill_trees.length;i++) {
        	String s[]= skill_trees[i].split("");
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	
        	for(int j=0; j<s.length; j++) {
        		for(int k =0; k<skills.length; k++) {
        			if(s[j].equals(skills[k]))
        				list.add(k);
        		}//k
        	}//j
        	
        	boolean check = false;
        	for(int j=0; j<list.size(); j++) {
        		if(list.get(j) != j)
        			check= true;
        	}
        	
        	if(check == false)
        		answer += 1;
        	
        }//i
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		
	
	}
}