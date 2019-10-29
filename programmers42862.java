import java.util.*;
import java.io.*;
public class programmers42862 {

}


class Main{
	
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int check[] = new int[n];
        
        //�ϴ� ��� 1�� �������
        for(int i=0;i<n;i++) 
        	check[i] = 1;
        
        //������ �ִ� ����� ��ġ�� +1 ������
        for(int i=0;i<reserve.length; i++) 
        	check[reserve[i]-1] = check[reserve[i]-1] +1;
        
        //�Ҿ���� ����� ��ġ�� -1 ������
        for(int i=0;i<lost.length;i++)
        	check[lost[i]-1] = check[lost[i]-1] -1;
        
        //greedy -> ���� �����ʸ� check�ϰڴ�!
        
        //1) 0��°�� ��, 1��° ��
        if(check[0]==2 && check[1]==0) {
        		check[0]=1;
        		check[1]=1;
        }
        
        //2) ��ü �л��� ���� 2�̻� 29���� �� ��
        for(int i=1; i<n-1; i++) {
        	
        	if(check[i]==1) //���� �� ���� �����ϱ�
        		continue;
        		
        	else if(check[i-1] == 0 && check[i]==2) { //���� ������ �ְ�, ������ ���� ���� ���� �ѱ�ڴ�
        		check[i-1]= 1;
        		check[i] = 1;
        	}
        	
        	//���ʿ� �ȳѰܵ� �ǰ� ���� ������ ���� ��
        	//���� ������ �ְ�, �������� ���� ���� ���� �ѱ�ڴ�
        	if(check[i]==2 && check[i+1]==0){ 
        		check[i] = 1;
        		check[i+1] =1;
        	}
        	
       }
       //3) �� �������� 2�̰� �� ���� 0�� ���
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