import java.util.*;

public class programmers_3_Á¤¼ö»ï°¢Çü {

    static public int solution(int[][] triangle) {
        
    	for(int i=1; i<triangle.length; i++) {
    		for(int j=0; j<triangle[i].length; j++) {
        		if(j==0) 
        			triangle[i][j] = triangle[i][j] + triangle[i-1][j];
        		
        		else if(j == triangle[i].length-1)
        			triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
        		else
        			triangle[i][j] = Math.max(triangle[i][j]+ triangle[i-1][j], 
        									triangle[i][j]+ triangle[i-1][j-1]);
        	}
        }
    	
    	int answer = 0;
    	int last = triangle.length-1;
    	for(int i=0; i<triangle[last].length; i++) {
    		answer = Math.max(answer, triangle[last][i]);
    	}
    	
        return answer;
    }
	
	public static void main(String args[]) {
		int arr[][] = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
	
		System.out.println(solution(arr));
	}
}
