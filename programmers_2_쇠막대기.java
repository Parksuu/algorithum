import java.util.*;


public class programmers_2_쇠막대기 {
    
	static public int solution(String arrangement) {
		int answer = 0;
        
		String st[] = new String[arrangement.length()];
		st = arrangement.split("");
        
		Stack<String> stk = new Stack<String>();
		String front = "";
		String temp = "";
		
		stk.add(st[0]);
		
		for(int i=1; i<st.length; i++) {
			front = st[i];//front는 temp 업데이트를 위해 위에서 st[i]로 해주는게 좋다
			
//			if(stk.isEmpty())
//				continue;

			if(st[i].equals("(")) {
				stk.add(st[i]);
			}
			
			else {
				if(temp.equals(")")) {
					stk.pop();
					answer = answer + 1;
				}
				else {
					stk.pop();
					answer = answer + stk.size(); 
				}
			}
			
			temp = front; //temp는 위의 if문 중 어디에 걸려서 나오더라도 temp=st[i-1]로 업데이트 해줘야함

		}
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution("()(((()())(())()))(())"));
	}
	
}
