class Solution {
	  public static int solution(int n) {
	      int arr[] = new int[n+1];
		  int answer = 0;
		  
		  for(int i=1;i<=n; i++) {
			  arr[i] = i;
		  }//배열에 1,2,3... 들어가있음
	      
          arr[0]=0;
		  arr[1]=0; //1은 소수가 아니니까 0으로 만들어줌
		  	
		  for(int i=2;i<=n;i++) {
			  if(arr[i]==0) //중복 배제
				  continue;
			  
			  for(int j = i+i; j<=n; j = j+i) 
				  arr[j]=0;
			  
		  }
		  
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i] != 0)
				  answer++;
				  
		  }
	    
	      return answer;
	  }
}
