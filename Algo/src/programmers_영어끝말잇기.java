import java.util.*;

public class programmers_������ձ� {
   
	static public int[] solution(int n, String[] words) {
        int[] answer =new int[2];
        int len = words.length;
        int turn = 0;       
        HashMap<String, Boolean> map = new HashMap<String,Boolean>();
        
        int i;
        map.put(words[0],true);
        for(i=1;i<len;i++) {
        	//front back ��
        	if(i != 0) {
	        	if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
	        		break;
        	}
        	
        	//map�� �־��ְ� �ִ��� ��
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
        	answer[0] = i%n +1; //���° �����  Ż���ϴ���
        	answer[1] = i/n +1; //�� ����� �ڽ��� ���°�� Ż���ϴ���
        }
       
        
        return answer;
    }
    
    
    
    
    public static void main(String[] args) {
    	String s[]= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
    	int an[] = solution(3,s);
    	System.out.println(an[0] + ", " +an[1]);
	}
    
    
}
