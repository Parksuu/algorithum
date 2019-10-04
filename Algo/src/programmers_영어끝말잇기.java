import java.util.*;

public class programmers_영어끝말잇기 {
   
	static public int[] solution(int n, String[] words) {
        int[] answer =new int[2];
        int len = words.length;
        int turn = 0;       
        HashMap<String, Boolean> map = new HashMap<String,Boolean>();
        
        int i;
        map.put(words[0],true);
        for(i=1;i<len;i++) {
        	//front back 비교
        	if(i != 0) {
	        	if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
	        		break;
        	}
        	
        	//map에 넣어주고 있는지 비교
         	if(map.containsKey(words[i]))
        		break;
        	else
        		map.put(words[i],true);
        }
        
        
        if(i == len) {
        	answer[0]=0;
        	answer[1]=0;
        }
        
        else {
        	answer[0] = i%n +1; //몇번째 사람이  탈락하는지
        	answer[1] = i/n +1; //그 사람이 자신의 몇번째에 탈락하는지
        }
       
        
        return answer;
    }
    
    
    
    
    public static void main(String[] args) {
    	String s[]= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    	int an[] = solution(3,s);
    	System.out.println(an[0] + ", " +an[1]);
	}
    
    
}
