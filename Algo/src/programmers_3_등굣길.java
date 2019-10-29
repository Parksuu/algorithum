import java.util.*;

public class programmers_3_µî±·±æ {

	
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int dp[][] = new int[n+1][m+1];
        
        for (int p[] : puddles) {
            dp[p[0]][p[1]] = -1; //¿õµ¢ÀÌ´Â -1
        }
        
        for(int i=1; i<puddles.length; i++) {
        	for(int j=1;j<puddles[i].length;j++) {
        		if(dp[i][j] == -1)
        			dp[i][j] = 0;
        		if(i == 1 || j ==1) {
        			dp[i][j] = 1;
        		}
        	}
        }
        
        
        dp[1][1] = 1; //ÃÊ±â °ªÀº 1·Î
        for(int i=1; i<puddles.length; i++) {
        	for(int j=1;j<puddles[i].length;j++) {
        		dp[i][j] = dp[i-1][j] + dp[i][j-1];
        	}
        	
        	answer = dp[n][m];
        }
 
        return answer;
    }
    
}
