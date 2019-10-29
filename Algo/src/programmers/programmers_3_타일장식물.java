import java.util.*;

public class programmers_3_타일장식물 {

    public long solution(int N) {
        long p_width = 0; long p_height = 0;
        long w_width = 0; long w_height = 0;
        
        if(N == 1) 
        	return 4;
        
        long answer = 0;
        //2부터라고 생각
        p_width = 1; p_height = 2;
        w_width = p_width; w_height = p_height;
        N--;
        
        while(N !=1) {
        	if(w_width < w_height) {
        		p_width = p_width + w_height;
        	}
        	
        	else {
        		p_height = p_height + w_width;
        	}
        	w_width = p_width;
        	w_height = p_height;
        	
        	N--;
        }
        
        answer = (w_width + w_height) *2;
        
        return answer;
    }
	
	public static void main(String args[]) {
		
	}
}
