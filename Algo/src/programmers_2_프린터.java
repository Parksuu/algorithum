import java.util.*;

public class programmers_2_������ {
	
    static public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> qu = new LinkedList<Integer>();
        
        for(int i=0;i<priorities.length;i++)
        	qu.add(priorities[i]);
         
        int idx = location;
        
        while(true) {
        	//�Ǿտ� �ְ� ���������� �켱������ ������
        	int front = qu.remove();
        	boolean check = false;
        	for(int i=0;i<qu.size();i++) {
        		if(front < qu.get(i)) {
        			//ū�� �����ϸ� pop�ƴϰ� �ڷ� ������
        			qu.add(front);
            		check = true;
        			break;
        		}
        		
        		//�ѹ��� �Ȱɸ��� false
        	}//for
        	
        	if(check == false) { //front���� ū�� ���������ʾҴٴ� ���� �� �������ϱ� answer ++
        		answer ++;
        		if(idx == 0)
        			break;
        		else
        			idx = idx-1;
        	}
        	else {
        		if(idx == 0)
        			idx = qu.size()-1;
        		else
        			idx = idx-1;
        	}
        	
        }//while
        
        return answer;
    }
	
    
	public static void main(String[] args) {
		int arr[] = {1,1,9,1,1,1};
		System.out.println(solution(arr,0));
		
	}
}
