
import java.util.*;

public class codeup_4564_��ܿ����� {
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int scores[] = new int[num+1];
		int dp[] = new int[num+1];
		
		for(int i=1; i<=num; i++)
			scores[i] = sc.nextInt();
		
		dp[1] = scores[1]; //1�� max�� 1
		dp[2] = dp[1] + scores[2]; //2�� max�� dp[1]���� �հ� + �ڱ��ڽ�
		
		for(int i=3; i<=num; i++)
			dp[i] = Math.max(scores[i] + dp[i-2] , scores[i] + scores[i-1] + dp[i-3]);
		
		System.out.println(dp[num]);
	}
	
}
