import java.util.*;

//남은거리가 (현재까지 온 거리)X2 보다 크면 순간이동, 아니면 점프
public class programmers_2_점프와순간이동 {
    
    static public int solution(int n) {
    	int dist = n;
    	int answer = 0;
    	
    	while(dist !=0) {
    		if(dist % 2 ==0) //짝수번이면 그 dist만큼 순간이동 할 수 있다.
    			dist = dist/2;
    		else
    		{
    			dist = dist-1; //여기서 jump한번해줌
    			answer ++;
    		}
    	}
    	
    	return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(6));
	}
}