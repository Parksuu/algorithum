import java.util.*;

public class programmers_2_탑 {
    
	static public int[] solution(int[] heights) {
		
		int size = heights.length;
		
        int[] answer = new int[size];
        
        int num = size-1;
        
        for(int i= size-1; i>=0; i--) {
        	for(int j = i-1; j>=0; j--) {
        		
        		if(heights[i]<heights[j]) {
        			answer[num] = j+1;        			
        			break;
        		}
        		
        		//실수 1) 위의 if를 돌고 없으면 ans[num]=0을 else에 넣어서 위에 조건에 만족을 안하면 else로 빠지게 해서 꼬임
        		//		break에 안걸리면 큰 값이 없다는거고 자연스럽게 ans[num]=0 을 넣어주면 된다
        		answer[num] = 0;
      			
        	}// in for

        	num--; //실수2) num--를 in for안에 넣어서 num 꼬임
        	
        }// out for
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int s[] = {1,5,3,6,7,6,5};
		int ans[] = solution(s);
		
		
		for(int i=0;i<s.length; i++)
			System.out.println(ans[i]);
	}
	
	
	
	
	
	
	
	
}
