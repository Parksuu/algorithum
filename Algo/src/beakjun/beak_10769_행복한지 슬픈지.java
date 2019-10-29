import java.util.*;

//일단 정답에 해당하는 시작점들은 찾아냄

public class Main {
	
	static String str[];

	static int pi1[] = new int[3];
	static int pi2[] = new int[3];
	
	static List list = new ArrayList();

	
	static void getPi(String pattern[],int pi[]) {
		int m = pattern.length;
		int j=0; // 패턴의 시작
		
		for(int i=1;i<m;i++) {
			
			while(j>0 && !pattern[i].equals(pattern[j])) 
				j=pi[j-1];		
			
			if(pattern[i].equals(pattern[j]))
				pi[i]= ++j;
		
		}
	}
	
	
	static int kmp(String pattern[], int pi[]) {
		int num=-1;  int count=0;
		int ss = str.length; int ps = pattern.length; int j=0;
		
		
		for(int i=0;i<ss;i++) {
			while(j>0 && !str[i].equals(pattern[j]))
				j=pi[j-1];	
			
			if(str[i].equals(pattern[j])) {
				if(j == ps-1) {
					//같다는거
					num = i-ps+1;
					list.add(num);
					j=pi[j];
					count++;
				}
				else 
					j++;
			}//if끝	

		}//for 끝
		
		return count;
	}
	
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String st = sc.nextLine();
    	str = new String[st.length()];
    	str = st.split("");
    		
    	String happy = ":-)";
    	String ha[] = new String[3];
    	ha = happy.split("");
    	
    	String sad = ":-(";
    	String sa[] = new String[3];
    	sa = sad.split("");
    	
    	getPi(ha,pi1); //happy에 대한 pi배열 만들어짐
    	getPi(sa,pi2); //sad에 대한 pi배열 만들어짐
    	
    	int happy_count = kmp(ha,pi1); //happy나온 개수
    	int sad_count = kmp(sa,pi2);

		
    	if(happy_count==0 && sad_count ==0) 
        	System.out.println("none");
    	
    	else if(happy_count==sad_count)
    		System.out.println("unsure");
    	
    	else if(happy_count>sad_count) 
    		System.out.println("happy");
    	
    	else if(happy_count<sad_count) 
    		System.out.println("sad");
    	

    }
}
