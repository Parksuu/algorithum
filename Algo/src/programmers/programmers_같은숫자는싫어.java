import java.util.*;

public class Solution {
	static public int[] solution(int []arr) {
		
        Stack<Integer> st = new Stack<Integer>();// 스택 생성
        
        st.add(arr[0]);// 일단 먼저 넣어놓고
        
        for(int i=1;i<arr.length;i++) {
        	
        	if(st.peek() == arr[i])
        		continue;
        	else if(st.peek() != arr[i])
        		st.push(arr[i]);
        	
        }

        int[] answer  = new int[st.size()];
        int[] answer1  = new int[st.size()];
        
        for(int i=0;i<answer.length;i++) {
        	answer[i] = st.pop();
        }
        
        int num=0;
        
        for(int i=answer.length-1 ;i>=0; i--) {
        	answer1[num] = answer[i];
        	num++;
        }
        
        return answer1;
	}
}
