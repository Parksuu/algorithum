
public class programmers_2_�ֽİ��� {

    static public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		
        		if(prices[i]<=prices[j])
        			answer[i] = answer[i] +1;
        		else {
        			answer[i] = answer[i] +1;
        			break;
        		}
        	}
        }
  
        return answer;
    }
	
    
	public static void main(String[] args) {
		
		int p[] = {1,2,3,2,3};
		int s[] = solution(p);
		
		for(int i=0;i<p.length; i++)
			System.out.println(s[i]);
	}
}
