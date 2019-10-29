import java.util.*;

public class beak_1918_����ǥ��� {

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
				stk.pop(); //����� (���� ������
			}
			
			else { //a~z�� ����
				answer = answer + a;
			}
		}//for
		
		//������ �� ��������
		while(!stk.isEmpty()) {
			answer = answer + stk.pop();
		}
		
		System.out.println(answer);
	}
}


import java.util.*;

public class beak_1918{
	
	static int calc(String s, int a, int b) {
		
		if(s.equals("+"))
			return a+b;
		
		else if(s.equals("-"))
			return a-b;
		
		else if(s.equals("*"))
			return a*b;
		
		else
			return a/b;
	}

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
				stk.pop(); //����� (���� ������
			}
			
			else { //a~z�� ����
				answer = answer + a;
			}
		}//for
		
		//������ �� ��������
		while(!stk.isEmpty()) {
			answer = answer + stk.pop();
		}
				
		
		//���⼭���� num���� �ٽ� ����	
		String num[] = answer.split("");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++) {
			String a = num[i];
			
			if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
			
					int aa = list.remove(list.size()-1);
					int bb = list.remove(list.size()-1);

					list.add(calc(a,bb,aa));
			}
			
			else { //0~9�� ����
				list.add(Integer.parseInt(a));
			}
		}//for
		
		for(int i=0;i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
	}
}