import java.util.*;


public class programmers_2_42586 {

    static public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> list = new LinkedList<Integer>();//답 담는 곳
        
        int idx = 0;
        int size = progresses.length;
        
        while(idx <= size-1) {
        	int num = 0;
        	
        	//일단 일을 하고
    		for(int i=0; i<size;i++) 
    			progresses[i] = progresses[i] + speeds[i];
    		
    		int temp = idx;
    		
    		while(progresses[temp] >= 100 && temp<size) {
    			num++;
    			temp++;
    			if(temp>=size) //오빠랑 다른 부분!! tmep가 끝까지 갔으면 멈추기
    				break;
    		}
    		
    		if(num>0)
    			list.add(num);
    		
    		idx = temp;
        }//while 끝
        return list.stream().mapToInt(i->i).toArray();
    }
	
	
	public static void main(String[] args) {
		
		int pro[] = {93,30,55};
		int sp[] = {1,30,5};
		
		int an[] = solution(pro,sp);

		for(int i : an) {
			System.out.println(i);
		}
	}
}
