
public class programmers_2_42577 {

	
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //작 큰 같 비교
        int size = phone_book.length;
        
        for(int i=0; i<size; i++) {
        	for(int j = i+1; j<size; j++) {
        		
        		if(answer == false)
        			return false;
        		
        		if(i !=j) {
	        		int a = phone_book[i].length();
	        		int b = phone_book[j].length();
	        		
	        		if(a>b) {
	        			if(phone_book[j].matches(phone_book[i].substring(0, b)))
	        				answer = false;
	        		}
	        		else if(a==b) {
	        			if(phone_book[j].matches(phone_book[i]))
	        				answer = false;
	        		}
	        		else {
	        			if(phone_book[i].matches(phone_book[j].substring(0, a)))
	        				answer = false;
	        		}
	        		
        		}//바깥 if
        	}//안쪽 for
        }//바깥 for
        
        
        
        return answer;
    }
    
    
}
