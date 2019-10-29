//import java.util.*;
//
//public class naver_coding_test_2 {
//	
//	public static void main(String[] args) {
//		String drum[] = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
//		String d[][] = new String[drum.length][drum.length];
//		
//		int answer = 0;
//		
//		for(int i=0;i<drum.length;i++) {
//			for(int j=0;j<drum.length;j++) {
//				d[i]= drum[i].split("");
//			}
//		}
//		
//		int size = drum.length;
//		
//		for(int k=0;k<size;k++) {
//			String start = d[0][k]; // 01, 02, 03, 04, 05, 06
//			int i=0; int j=k;
//			int check = 0; //*두번만나면 break하고 나오기
//			System.out.println(k + "번째 일 때");
//			while(true) {
//
//				String now  = start;
//				if(now.equals("#")) {
//					now = d[i+1][j];
//					i = i+1;
//					System.out.print(now);
//				}
//				if(now.equals(">")) {
//					now = d[i][j+1];
//					j = j+1;
//					System.out.print(now);
//				}
//				if(now.equals("<")) {
//					now = d[i][j-1];
//					j = j-1;
//					System.out.print(now);
//				}
//				if(now.equals("*")) {
//					now = d[i+1][j];
//					i = i+1;
//					System.out.print(now);
//					++check;
//				}
//
//				if(check==2)
//					break;
//				if(check<2 && i==size-1) {
//					answer++;
//					break;
//				}
//				
//			}
//			System.out.println(answer);
//			System.out.println("");
//			
//		}
//		
//		System.out.println(answer);
//		
//		
//	}
//	
//}

import java.util.*;

public class naver_coding_test_2 {
	
	class node{
		int num = 0;
		int visit=0;
	}
	
	public static void dfs() {}
	
	public static void main(String[] args) {
		String drum[] = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
		String d[][] = new String[drum.length][drum.length];
		int visit[][] = new int[1000][1000];
		int answer = 0;
		
		for(int i=0;i<drum.length;i++)
				d[i]= drum[i].split("");

		int size = drum.length;
		
		for(int k=0;k<size;k++) {
			String start = d[0][k]; // 01, 02, 03, 04, 05, 06
			int i=0; int j=k;
			int check = 0; //*두번만나면 break하고 나오기
			System.out.println(k + "번째 일 때");
			while(true) {

				String now  = start;
				if(now.equals("#")) {
					now = d[i+1][j];
					i = i+1;
					System.out.print(now);
				}
				if(now.equals(">")) {
					now = d[i][j+1];
					j = j+1;
					System.out.print(now);
				}
				if(now.equals("<")) {
					now = d[i][j-1];
					j = j-1;
					System.out.print(now);
				}
				if(now.equals("*")) {
					now = d[i+1][j];
					i = i+1;
					System.out.print(now);
					++check;
				}

				if(check==2)
					break;
				if(check<2 && i==size-1) {
					answer++;
					break;
				}
				
			}
			System.out.println(answer);
			System.out.println("");
			
		}
		
		System.out.println(answer);
		
	}
	
}
