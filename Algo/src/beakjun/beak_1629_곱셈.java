import java.util.*;
import java.io.*;

public class Main {
	   
	public static long pow(int a,int b,int c) {
		
		if(b==0) //a의 어떤 0제곱도 1 나누면 나머지는 항상 1
			return 1;
		
		long n = pow(a,b/2,c);
		
		long temp = n * n %c;
		
		if(b%2 == 0)//짝수일 땐, 절반한거 * 절반한거
			return temp;
		else //홀수일 땐, 절반한거*절반한거 *a
			return temp*a %c;
	}	
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(pow(a,b,c));
	}
	
}
