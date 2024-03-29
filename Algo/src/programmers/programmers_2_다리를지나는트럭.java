import java.util.*;

public class programmers_2_다리를지나는트럭 {

    static public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ing = new ArrayList<Integer>();
        
        int answer = 0;
        int size = truck_weights.length;
        int order = 0;
 
        //첫번째 거 적재
        list.add(truck_weights[0]); // 첫번째 트럭 다리에 올림
        ing.add(1); //첫번쨰 트럭의 다리 위치
        size = size-1; //가야하는 트럭 사이즈 -1
        order = order+1; //다음 트럭의 순서
        answer= answer +1; //하나 적재했으니까 +1초
        
        while(!(size==-1)) {
        	if(!list.isEmpty()) { //다리위에 트럭이 있는 경우
	        	for(int i=0; i<ing.size(); i++) //일단 존재하는 애들 한칸씩 다리옮기기
	        		ing.set(i, ing.get(i)+1);
	        
	        	if(order < truck_weights.length) { //다음 트럭이 존재하는 경우
	        		int wei=0;
	        		for(int j=0;j<list.size();j++) 
	        			wei = wei+ list.get(j);
	        		
	        		if(weight >= wei + truck_weights[order]){ //현재 다리위의 트럭의 무게와 다음 올라올 트럭의 무게의 합이 다리의 무게보다 작거나 같으면
	        			list.add(truck_weights[order]);
	        			ing.add(1);
	        			order = order +1;
	        		}
	        	}
	        	
	        	if(ing.get(0) == bridge_length) { //맨 앞의 트럭이 다리길이에 도달했으면
	        		list.remove(0);
	        		ing.remove(0);
	        		size = size -1;
	        	}
        	}//바깥 if
        	
        	else {//다리에 아무 트럭도 없을 때,  ->무조건 다음 트럭이 존재한다
        		list.add(truck_weights[order]);
        		ing.add(1);
        		order = order +1;
        	}	
        	answer++; //초 증가
        }
        
        return answer+1; //빠져 나갔을 때도 초 세줌
    }
    
    
    public static void main(String[] args) {
		int tw[] = {10,10,10,10,10,10,10,10,10,10};
		
    	System.out.println(solution(100,100,tw));
	}
	
}
