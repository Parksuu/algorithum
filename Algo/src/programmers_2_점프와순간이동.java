import java.util.*;

//�����Ÿ��� (������� �� �Ÿ�)X2 ���� ũ�� �����̵�, �ƴϸ� ����
public class programmers_2_�����ͼ����̵� {
    
    static public int solution(int n) {
    	int dist = n;
    	int answer = 0;
    	
    	while(dist !=0) {
    		if(dist % 2 ==0) //¦�����̸� �� dist��ŭ �����̵� �� �� �ִ�.
    			dist = dist/2;
    		else
    		{
    			dist = dist-1; //���⼭ jump�ѹ�����
    			answer ++;
    		}
    	}
    	
    	return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(6));
	}
}