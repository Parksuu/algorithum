package ct_11����;

import java.util.LinkedList;

public class ct1{
	
    public static String change(int num,int su){
        LinkedList stack= new LinkedList();//�������� ���
        String result="";
        
        while(num>0){
            if(num%su>9)
                stack.add((char)(num%su+55));
            else

                stack.add(num%su);
            
            num=num/su;
        }
        
        while(!stack.isEmpty())
            result+=stack.pollLast();

        if(result.equals("")) {
        	result="0";
        	result=+num+"�� "+su+"������  ����--->  "+result;
        }
        
        return result;
    }
	
    public static int recur(String s) { 
    	int re = 1;
    	
    	for(int i=0;i<s.length();i++) {
    		String a = String.valueOf(s.charAt(i));
    		
    		re = re * Integer.parseInt(a);
    	}

    	return re;
    }
    
	static public int[] solution(int N) {
		int answer[] = new int[2];
		
		int arr[] = new int[10]; // ���� ����
		
		for(int i=2;i<10;i++) {
			String a = change(N,i);
			arr[i] = recur(a);
		}
		
		int max = arr[0];
		int idx = 0;
		for(int i=1;i<10;i++) {
			if(max<=arr[i]) {
				max = arr[i];
				idx = i;
			}
		}

		answer[0] = idx;
		answer[1] = max;
		
		System.out.println(idx);
		System.out.println(max);
		
		return answer;
	}


	
	public static void main(String[] args) {
		solution(14);
	}
}