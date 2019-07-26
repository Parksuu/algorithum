class Solution {
	public static long solution(int a, int b) {
		
		long sum = 0;
		
		if(a>b) {
			for(int i=b; i<=a; i++) {
				sum=sum+i;
			}
			
			
		}
		
		else if(a<b) {
			for(int i=a; i<=b; i++) {
				sum=sum+i;
			}
			
		}
		
		else if(a==b) {
			sum = a;
		}
		
		return sum;
	}
	
}
