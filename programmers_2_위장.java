import java.util.*;

public class programmers_2_위장 {
	
   static public int solution(String[][] clothes) {
    	
		HashMap<String,Integer> map = new HashMap<String,Integer>();
    	int size = clothes.length;
   
    	for(int i=0; i<size; i++) {
    		String a = clothes[i][1]; //옷 종류
    		
    		if(map.containsKey(a)) { //map에 a라는 키를 가진 객체가 있다면
    			int num = map.get(a);
    			map.put(a, ++num); //증가시켜서 넣고
    		}
    		else { //map에 a라는 키가 없고 새로 추가하는거라면
    			map.put(a, 1);
    		}
    	}
    	
    	
    	int answer = 1;
        for(int i: map.values()) {
        	answer = answer*(i+1);
        }
    	
    	return answer-1;
    }
	
	
	public static void main(String[] args) {

		String ar[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		System.out.println(solution(ar));
	}
}
