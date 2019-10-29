import java.util.*;

public class kakao_2019_1 {
	
	static public int solution(String s) {
        int answer = s.length()*2;
 
        String result = "";
        String preStr = "";
        String nextStr = "";
        
        int strLength = 0;
        int count = 0;
        
        if(s.length()==1)
        	return 1;
        
        for(int k=1; k<s.length(); k++) {
//        	System.out.println("k:"+k);
	        for(int i = 0 ; i<=s.length(); i=i+k){
	            if(i == s.length() || i+k>s.length())
	                nextStr = s.substring(i);
	            else
	                nextStr = s.substring(i, i+k);
	
	            if(nextStr.equals(preStr))
	                count++;
	            else{
	                if(!preStr.equals("")){
	                	if(count == 0) { 
	                		result = result + preStr;
	                		count = 0;
	                	}
	                	else{
	                		result = result + String.valueOf(count+1) + preStr;
	                		count = 0;
	                		}  
	                }
	            }
	            if(i+k>s.length()) { // �ڿ� ���� ���ڿ� �ٿ��ֱ�  
	            	result += s.substring(i);
	            }
	
	            preStr = nextStr;
	          
	        }//���� for
	      
//	        System.out.println(s);
//	        System.out.println(result);
	        strLength = result.length();
//	        System.out.println("strLength:"+strLength);
//	        System.out.println();
//          
	        result = "";
	        preStr = "";
	        nextStr = "";
	        
	        answer = Math.min(answer,strLength);
	        
		}//�ٱ� for
        
        return answer;
        
    }

	
	public static void main(String[] args) {
		String s = "aabbaccc";
		int a = solution(s);
		System.out.println(a);
	}
}