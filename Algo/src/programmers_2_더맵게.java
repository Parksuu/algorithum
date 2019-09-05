import java.util.*;

public class programmers_2_´õ¸Ê°Ô {

    static public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> list = new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length; i++)
        	list.add(scoville[i]);
        
        
        while(list.peek()<K) {
        	int a = list.poll();
        	int b = list.poll();
        	
        	int sco = a + (b*2);
        	
        	list.add(sco);
        	       	        	
        	if(list.size() ==1) {
        		if(K>list.peek())
        			return -1;
        	}
        	
        	answer++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int a[] = {1,2,3,9,10,12};
		System.out.println(solution(a,7));
	}
}
