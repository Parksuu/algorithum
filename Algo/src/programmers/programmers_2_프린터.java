import java.util.*;

public class programmers_2_프린터 {
	
    static public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> qu = new LinkedList<Integer>();
        
        for(int i=0;i<priorities.length;i++)
        	qu.add(priorities[i]);
         
        int idx = location;
        
        while(true) {
        	//맨앞에 애가 나머지보다 우선순위가 높은지
        	int front = qu.remove();
        	boolean check = false;
        	for(int i=0;i<qu.size();i++) {
        		if(front < qu.get(i)) {
        			//큰게 존재하면 pop아니고 뒤로 보낸다
        			qu.add(front);
            		check = true;
        			break;
        		}
        		
        		//한번도 안걸리면 false
        	}//for
        	
        	if(check == false) { //front보다 큰게 존재하지않았다는 얘기고 걘 나갔으니까 answer ++
        		answer ++;
        		if(idx == 0)
        			break;
        		else
        			idx = idx-1;
        	}
        	else {
        		if(idx == 0)
        			idx = qu.size()-1;
        		else
        			idx = idx-1;
        	}
        	
        }//while
        
        return answer;
    }
	
    
	public static void main(String[] args) {
		int arr[] = {1,1,9,1,1,1};
		System.out.println(solution(arr,0));
		
	}
}
