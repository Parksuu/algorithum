import java.util.*;

public class programmers_2_소수만들기 {
	static int answer = 0;
    static int arr[] = new int[3001];	
	public static void combination(List<Integer> list, int len, int r, int piv) {	
		int num = 0;
		
		if(r == 0)//기저조건
		{
			for(int i=len;i<list.size();i++)
				num = num + list.get(i);
			
			if(arr[num] !=0)
				answer++;
			
			return;
		}
		
		for(int i=piv; i<len;i++) {
			list.add(list.get(i));
			combination(list,len,r-1,i+1);//기저까지 다 돌고
			list.remove(list.size()-1);//다 돌고 나오면 맨마지막거 지워준다
		}
		
	}
	
	static public int solution(int[] nums) {
  
		

		 for(int i=1;i<=3000; i++) {
			 arr[i] = i;
		 }//배열에 1,2,3... 들어가있음
	      
          arr[0]=0;
		  arr[1]=0; //1은 소수가 아니니까 0으로 만들어줌

		  //sqrt(3000) or i*i
		  for(int i=2;i<=3000;i++) {
			  if(arr[i]==0) //중복 배제
				  continue;
			  
			  for(int j = i+i; j<=3000; j = j+i) 
				  arr[j]=0;
			  
		  }
		
		
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++)
        	list.add(nums[i]);
		
       
        combination(list, list.size(), 3, 0);
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int num[] = {1,2,3,4};
		solution(num);
		System.out.println(answer);
	}

	
}
