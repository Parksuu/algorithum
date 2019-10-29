import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
 
public class Main{
 
	
	
    
    public static void main(String args[]) {
    	
    	Scanner sc= new Scanner(System.in);
    	
    	String sor = sc.next(); // 배열 받기
 
    	String s[]; //문자열로 된 배열
		s = new String[sor.length()]; //배열의 사이즈만큼 초기화    	
    	
		Stack stk = new Stack(); //스택 생성
		int all = 0;
		
    	for(int i=0;i<sor.length();i++) 
    		s[i] =Character.toString(sor.charAt(i)); // 배열 s에 차곡차곡 넣기
    	
    	
    	
    	for(int i=0;i<s.length;i++) {
    		if(s[i].equals("(")) {
    			stk.push(s[i]); //push한다
    		}
    		
    		else {
    			stk.pop(); //일단 pop하고 
    			
    			if(s[i-1].equals("("))
    				all = all+ stk.size(); //자를 때 마다 스택개수만큼의 막대기가 생긴다
    			else
    				all = all+1; //나머지일 경우에는 맨 위의 스택의 남은 막대기 증가시키기
    		}
    		
    	}
   
    	
    	System.out.println(all);
    	
    }
}
