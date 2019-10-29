package naver_ct;

import java.util.*;

public class naver_3{
	
	   public static int[] solution(int[] cook_times, int[][]order, int k) {
	       int size=cook_times.length;
	       int visited[]=new int[size]; //�ּ� ��� ������
	       int min_list[]=new int[size]; //�ּ� ����
	       
	       for(int i=0;i<size;i++) {
	          min_list[i]=cook_times[i]; //�ϴ� �� �ʵ� �� ����
	          visited[i]=0; // �湮�� ���� 0����
	       }
	       
	       int end=order.length;
	       
	       for(int i=0;i<end;i++) {
	          int pre=order[i][0]-1; //���� �����ؾ��ϴ� ��
	          int now=order[i][1]-1; //���� �����ϴ� ��
	          
	          if(visited[pre]==0) //���������ؾ� �ϴ°��� �Ȱ��ٿԴٸ�
	        	  visited[now]= visited[now]+1; // visited�� ���簡���ϴ� ���� +1
	          else
	        	  visited[now]= visited[now]+visited[pre];
	          
	          int num=cook_times[now]+min_list[pre]; //���������� + ��������Ѵ����� ��
	          
	          if(min_list[now]==cook_times[now]) 
	        	  min_list[now]=num;
	          else if(min_list[now]<num)
	        	  min_list[now]=num;
	          
	       }
	       
	      int answer[] = new int[2];
	      answer[0]=visited[k-1]; //5�ܰ踦 �� �˱� ���ؼ��� visited[4]; �迭���� 0,1,2,3,4���̴ϱ�
	      answer[1]=min_list[k-1];
	         
	       return answer;
	   }
	
	
	
	public static void main(String args[]) {
		

	}
	
}
