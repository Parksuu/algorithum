import java.util.*;

public class kakao_2018_오픈채팅방 {
	
    static public String[] solution(String[] record) {
    	HashMap<String, String> map = new HashMap<String,String>();
    	ArrayList<String> list = new ArrayList<String>();
    	
    	//들어온 명령어 저장해놓기
    	for(int i=0;i<record.length;i++) {
    		String s[] = record[i].split(" ");

    		if(s[0].equals("Enter"))
    			map.put(s[1], s[2]); //key- uid와 value-name 넣기    		
    		else if(s[0].equals("Change")) 
    			map.put(s[1], s[2]); //uid 찾아서 name 변경
    	}
    	
    	//명령 합치기
        for(int i=0; i<record.length; i++) {
        	String a[] = record[i].split(" ");
        	if(!a[0].equals("Change")) {
	        	if(a[0].equals("Enter")) {
	        		String b = (String)(map.get(a[1]));
	        		list.add(b + "님이 들어왔습니다.");
	        	}
	        	else if(a[0].equals("Leave")) {
	        		String b = (String)(map.get(a[1]));
	        		list.add( b + "님이 나갔습니다.");
	        	}	
        	}
        }
    	
        String answer[] = {};
    	return list.toArray(answer);
    }
	
	public static void main(String[] args) {
		String re[] = {"Enter u1 M", "Enter u2 P", "Leave u1", "Enter u1 P", "Change u2 R"};
		String a[] = solution(re);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}


//static public String[] solution(String[] record) {
//    String instr[][] = new String[record.length][2];
//    HashMap<String, String> map = new HashMap<String,String>();
//    
//    int n = 0;
//	//들어온 명령어 저장해놓기
//	for(int i=0;i<record.length;i++) {
//		String s[] = record[i].split(" ");
//		
//		if(!s[0].equals("Change")) {
//    		instr[i][0] = s[0]; //Enter, Leave
//    		instr[i][1] = s[1]; //uid
//    		n++;
//    	}
//		
//		//들어온 게 enter leave change면 여기서 처리해주기
//		if(s[0].equals("Enter")) {
//			map.put(s[1], s[2]); //key- uid와 value-name 넣기
//		}
//		
//		else if(s[0].equals("Change")) {
//			map.put(s[1], s[2]); //uid 찾아서 name 변경
//		}
//	}
//	
//	//명령 합치기
//	String[] answer = new String[n]; 
//    for(int i=0; i<n; i++) {
//    	if(instr[i][0].equals("Enter")) {
//    		String a = (String)(map.get(instr[i][1]));
//    		answer[i] = a + "님이 들어왔습니다.";
//    	}
//    	
//    	else if(instr[i][0].equals("Leave")) {
//    		String a = (String)(map.get(instr[i][1]));
//    		answer[i] = a + "님이 나갔습니다.";
//    	}
//    }
//	
//	return answer;
//}

