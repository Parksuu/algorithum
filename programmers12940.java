
public class programmers12940 {

	
	  public int[] solution(int n, int m) {
	      int[] answer = new int[2];

	      
	      //�ִ����� - ��Ŭ���� ȣ����
	      if(m>n) {
	    	  int temp = m;
	    	  m = n;
	    	  n = temp;
	      }
	   
	      int realn = n;
	      int realm = m;
	      
	      //n�� ũ�� m�� �۴ٰ� ����

	     int num = -1;
	     
	     while(num !=0) {
	    	 if(num==0) break;
	    	 num = realn%realm;
	    	 realn = realm;
	    	 realm = num;
	     }
	     
	     //realm, realn ��������� n,m���� ����� �� �� �������
	     
	     answer[0] = realm;
	      
	     answer[1] = n*m/realm; 
	      //�ּҰ����
	      
	      
	      return answer;
	  }	
	
}