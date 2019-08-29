import java.util.*;

public class programmser_2_HIndex {

    static public int solution(int[] citations) {
        int size = citations.length;
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=0;i<size;i++) {
        	int smaller = Math.min(citations[i], size-i);
        	answer = Math.max(answer, smaller);
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		int a[]= {3,0,6,1,5};
		
		System.out.println(solution(a));
		
	}
}
