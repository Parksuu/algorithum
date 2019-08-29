import java.util.*;


public class programmers_2_Ÿ�ٳѹ� {

	static int sum = 0;
	static int answer= 0;
	
	static void dfs(int numbers[], int index, int sum, int target) {
		if(index == numbers.length) {
			if(sum == target) {
				answer ++;
				return ;
			}
		}
		
		else if(index < numbers.length){
			dfs(numbers, index+1, sum + numbers[index], target);
			dfs(numbers, index+1, sum - numbers[index], target);
		}
	}
	
	static public int solution(int[] numbers, int target) {
		
		dfs(numbers,0,sum,target);
        return answer;
    }
    
	public static void main(String[] args) {
		int a[] = {1,1,1,1,1};
		
		System.out.println("��:" + solution(a,3));
		
	}
}


//static public int solution(int[] numbers, int target) {
//    
//    ArrayList<Integer> list = new ArrayList<Integer>();
//    int temp = 0;
//    
//    list.add(numbers[0]);
//    list.add(-1 * numbers[0]);
//    temp = 2;
//   
//    for(int i=1;i<numbers.length; i++) {
//	
//    	for(int j=0; j<temp; j++) {
//    		int a = list.remove(0);
//    		list.add( a + numbers[i]);
//    		list.add( a + (-1 * numbers[i]) );
//
//    	}//for
//    	
//    	temp = temp*2;  
//    	
//    }//for
//    
//    
//    int answer = 0;         
//    for(int i=0;i<list.size(); i++) {
//    	if(list.get(i) == target)
//    		answer++;
//    }
//    
//    return answer;
//}




