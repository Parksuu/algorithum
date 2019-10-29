import java.util.*;

class Solution {
    public static int[] solution(int[] answers) {
          	
    	int a[] = {1,2,3,4,5};
    	int b[] = {2,1,2,3,2,4,2,5};
        int c[] = {3,3,1,1,2,2,4,4,5,5};
        
        int ans[] = new int[] {0,0,0};
        int max=0;
        
        //동적배열을 못만든느 대신에 새 리스트를 만들어서 해결한다
        List<Integer> cnt = new ArrayList<>();
        
        for(int i=0;i<answers.length;i++) {
        		
        		if(answers[i] == a[i%5])
        			ans[0]++;
       

        		if(answers[i] == b[i%8])
        			ans[1]++;
        	
        		
        		if(answers[i] == c[i%10])
        			ans[2]++;
        }
        
        for(int i=0;i<ans.length;i++) {
        	if(ans[i]>max)
        		max=ans[i];
        }
        
        for(int i=0;i<3;i++) {
        	if(ans[i]==max)//동적 배열을 만들 수가 없으니까 answer[0]에 1 or 12 or 123이런식으로 못넣음
        		cnt.add(i+1);//리스트에 일단 추가시켜준다
        }
        
        //int[] answer = {}; --> 이말은 배열로 보내기만 하면된다는 뜻
    	
        //list를 int[]로 변환하는 법 ->스트림
        return cnt.stream().mapToInt(i->i).toArray();
    }
}
