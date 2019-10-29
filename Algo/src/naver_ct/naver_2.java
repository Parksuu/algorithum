package naver_ct;

import java.util.*;

public class naver_2 {
	
	static long[]d = new long[1000000];
	static long a,b;
	
	public static void main(String[] args) {

		//sol -a  d-b  D-d
		long answer = 0;
		
		long[]d = new long[1000000];
		long a=2;
		long b;
		
		for(int i=1;i<=9;i++) {
			b=i;
			d[i]=b;
			
			if(b>a)  a=b;
			for(int j = i-1; j>=1; j--) {
				b = b* d[j];
				if(b>a) a=b;
			}
			
			System.out.println(a);
		}
	
	}
	

}
