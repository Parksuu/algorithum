class Solution {
	public static String solution(int a, int b) {
		
		int months[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String answer="";
		
		int sum = 0;
		
		if(a != 1){
			for(int i=0;i<a-1; i++)
				sum = sum + months[i];
			
			sum = sum+b;
		}
		
		else 
			sum = b;
		
		//날짜 계산
		if(sum%7 == 0)
			answer = "THU";
		else if(sum%7 == 1)
			answer = "FRI";
		else if(sum%7 == 2)
			answer = "SAT";
		else if(sum%7 == 3)
			answer = "SUN";
		else if(sum%7 == 4)
			answer = "MON";
		else if(sum%7 == 5)
			answer = "TUE";
		else if(sum%7 == 6)
			answer = "WED";
		
		return answer;
	}
}
