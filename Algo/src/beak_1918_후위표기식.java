import java.util.*;

public class beak_1918_후위표기식 {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String arr[] = s.split("");
		String answer = "";
		
		for(int i=0;i<arr.length;i++) {
			String a = arr[i];
			
			if(a.equals("+") || a.equals("-")) {
			
				while(!stk.isEmpty() && !stk.peek().equals("(")) 
					answer = answer + stk.pop();
				
				
				stk.push(a);
			}//if
			
			else if(a.equals("*") || a.equals("/")) {
				if(!stk.isEmpty() && (stk.peek().equals("*") || stk.peek().equals("/")))
					answer = answer + stk.pop();
//				while(!stk.isEmpty() && (stk.peek().equals("*") || stk.peek().equals("/")))
//					answer = answer + stk.pop();
				
				stk.push(a);
			}
			
			else if(a.equals("(")) {
				stk.push(a);
			}
			
			else if(a.equals(")")){
				while(!stk.peek().equals("(")) {
					String p = stk.pop();
					if(p.equals("+") || p.equals("-") || p.equals("*") || p.equals("/"))
						answer = answer + p;
				}
				stk.pop(); //해줘야 (까지 없어짐
			}
			
			else { //a~z의 문자
				answer = answer + a;
			}
		}//for
		
		//끝까지 다 돌았으면
		while(!stk.isEmpty()) {
			answer = answer + stk.pop();
		}
		
		System.out.println(answer);
	}
}