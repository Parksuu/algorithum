import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();

    	String name[] = new String[num];
    	
    	int grade[][] = new int[num][3]; //num행 과목은 3개
    	
    	for(int i=0;i<num;i++) {
    		String n = sc.next();
    		int g1 = sc.nextInt();
    		int g2 = sc.nextInt();
    		int g3 = sc.nextInt();
    		
    		name[i] = n;
    		grade[i][0] = g1;
    		grade[i][1] = g2;
    		grade[i][2] = g3;
    		
    	}
    	
    	int max=0;
    	for(int i=0;i<num; i++) {
    		if(grade[i][0]>max)
    			max = grade[i][0]; //첫번째 과목의 1등을 max에 넣음
    	}
    	
    	int find = -1; //1등한 i번째 애 찾음  -> name[find]에 첫 번쨰 과목을 1등한 학생의 이름 저장되어있음
    	for(int i=0;i<num;i++) {
    		if(grade[i][0]==max) {
    			find = i;
    			break;
    		}
    	}
    	
    	
    	//i번째 애의 grade[i][1]과 grade[i][2]의 석차를 알아내야 함
    	
    	//점수 찾아놓고
    	int g_1 = grade[find][1];
    	int g_2 = grade[find][2];
    	
    	ArrayList<Integer> list1 = new ArrayList<Integer>();
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
    	
    	for(int i=0; i<num; i++) {
    		list1.add(grade[i][1]);
    		list2.add(grade[i][2]);
    	}
    	
    	//내림차순 정렬
    	Collections.sort(list1);
    	Collections.sort(list2);
    	Collections.reverse(list1);
    	Collections.reverse(list2);
    	
    	int result1 = 0;
    	int result2 = 0;
    	
    	for(int i=0;i<list1.size();i++) {
    		result1++;
    		if(list1.get(i)==g_1)
    			break;
    	}
    	
    	for(int i=0;i<list1.size();i++) {
    		result2++;
    		if(list2.get(i)==g_2)
    			break;
    	}
    	
    	System.out.println( name[find] + " " + result1 + " " + result2 );
    	
    }
}
