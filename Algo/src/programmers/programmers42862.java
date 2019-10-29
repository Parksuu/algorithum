import java.util.*;
import java.io.*;
public class programmers42862 {

}


class Main{
	
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int check[] = new int[n];
        
        //일단 모두 1로 만들어줌
        for(int i=0;i<n;i++) 
        	check[i] = 1;
        
        //여분이 있는 사람의 위치는 +1 시켜줌
        for(int i=0;i<reserve.length; i++) 
        	check[reserve[i]-1] = check[reserve[i]-1] +1;
        
        //잃어버린 사람의 위치는 -1 시켜줌
        for(int i=0;i<lost.length;i++)
        	check[lost[i]-1] = check[lost[i]-1] -1;
        
        //greedy -> 나의 오른쪽만 check하겠다!
        
        //1) 0번째일 때, 1번째 비교
        if(check[0]==2 && check[1]==0) {
        		check[0]=1;
        		check[1]=1;
        }
        
        //2) 전체 학생의 수가 2이상 29이하 일 때
        for(int i=1; i<n-1; i++) {
        	
        	if(check[i]==1) //옷을 줄 수가 없으니까
        		continue;
        		
        	else if(check[i-1] == 0 && check[i]==2) { //내가 여분이 있고, 왼쪽이 옷이 없을 때만 넘기겠다
        		check[i-1]= 1;
        		check[i] = 1;
        	}
        	
        	//왼쪽에 안넘겨도 되고 내가 여분이 있을 때
        	//내가 여분이 있고, 오른쪽이 옷이 없을 때만 넘기겠다
        	if(check[i]==2 && check[i+1]==0){ 
        		check[i] = 1;
        		check[i+1] =1;
        	}
        	
       }
       //3) 맨 마지막이 2이고 그 앞이 0일 경우
        if(check[n-2]==0 && check[n-1]==2) {
        	check[n-2]=1;
        	check[n-1]=1;
        }
        
        for(int i=0;i<check.length; i++) {
        	if(check[i] ==1 || check[i] == 2)
        		answer++;
        }
        
        
        return answer;
    }
	
    
	public static void main(String args[]) {
			
	}
	
}