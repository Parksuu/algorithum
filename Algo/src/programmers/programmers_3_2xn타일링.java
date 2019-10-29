import java.util.*;

public class programmers_3_2xn타일링 {

	int dp[] = new int[60001];
	
	
	public int tile(int n) {
		
		//기저 조건
		if(n == 1) {
			dp[1] =1;
			return 1;
		}
		
		if(n == 2) {
			dp[2] = 2;
			return 2;
		}
		
		if(dp[n] != 0)
			return dp[n];
		
		else{
			dp[n] = tile(n-1) + tile(n-2);
		}
		
		dp[n] = dp[n] % 1000000007;
		
		return dp[n];

	}
	
	
	  public int solution(int n) {
	      
	      return tile(n);
	  }
	
}
