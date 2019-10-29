import java.util.*;
import java.util.regex.Pattern;

public class kakao_2019_4 {

   static public int[] solution(String[] words, String[] queries) {
        int[] answer = new int[words.length];
        

        for(int i=0;i<words.length;i++) {
        	String a = words[i];
        	System.out.println(a);

        	for(int j=0; j<queries.length; j++) {
        		if(a.length() != queries[j].length()) {
        			System.out.println(queries[j]+ "�� �� �Ѿ����");
        			continue; //���� �ȸ����� �ѱ��
        		}
        		if(!queries[j].contains("?"))
        			continue;
        		else {
        			int firstIdx = queries[j].indexOf("?");
        			int lastIdx = queries[j].lastIndexOf("?");
        			System.out.println("first " + queries[j] +"->"+ firstIdx);
        			System.out.println("last "+ queries[j] +"->" +lastIdx);
        			if(firstIdx == lastIdx) 
        				queries[j]=queries[j].replace(queries[j].substring(firstIdx,firstIdx+1),a.substring(firstIdx,firstIdx+1));        				
        			
        			//�ٸ���
        			else
        				queries[j]=queries[j].replace(queries[j].substring(firstIdx,lastIdx+1),a.substring(firstIdx,lastIdx+1));

        		}//�ٱ� else


        		//��ü�Ұ� �� ��ü�ϰ�
        		if(a.equals(queries[j])) 
        			answer[i]++;
        	}//���� for
        }//�ٱ� for
        
        return answer;
    }
	
	public static void main(String[] args) {
		String w[]= {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String q[] = {"fro??", "????o", "fr???", "fro???", "pro?"};
		int result[] = solution(w,q);
		
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}
}