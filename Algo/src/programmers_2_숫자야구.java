import java.util.*;

public class programmers_2_숫자야구 {

    public int solution(int[][] baseball) {
        int answer = 0;
        
        for(int i=0;i<baseball.length; i++) {
        	String a = String.valueOf(baseball[i][0]); //숫자 문자열 형태로 넣어놓음
        	int s = baseball[i][1]; //strike 수 - 자리,숫자 다 맞음
        	int b = baseball[i][2]; //ball 수 - 숫자만 맞음
        	
        }
        
        
        for(int i=123; i<=987; i++) {
        	boolean check = true;
        	
        	String s1[] = String.valueOf(i).split("");
        	
        	if(s1[0].equals(s1[1]) || s1[0].equals(s1[2]) || s1[1].equals(s1[2]))
        		continue;
        	if(s1[0].equals("0") || s1[1].equals("0") || s1[2].equals("0"))
        		continue;
        	
        	
        	for(int j=0;j<baseball.length;j++) {
        		String s2[] = String.valueOf(baseball[j][0]).split("");
            	int strike = 0;
            	int ball = 0;
        		
        		for(int a = 0; a<3;a++) {
        			for(int b = 0;b<3;b++) {
        				if(a==b && s1[a].equals(s2[b])) {//자리 같고 숫자 같으면
        					strike++;
        					continue;
        				}
        				if(a!=b && s1[a].equals(s2[b])) {//자리 다르고 숫자 같으면
        					ball++;
        					continue;
        				}
        			}
        		}
        		
        		if(strike!=baseball[j][1] || ball!=baseball[j][2]) {
        			check=false;
        		}
        	}
        	
        	if(check==true)
        		answer++;

        }
        
        return answer;
    }
    
    
    public static void main(String args[]) {
    	
    	
    }
    
}
