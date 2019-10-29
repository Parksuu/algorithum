import java.io.*;

public class Main {


	public static void main(String args[]) throws Exception{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(in.readLine());//배열 개수 받기
		
		int a=1;
		int b=0;
		int c=0;
		int temp;
		
		if(t==1)
			System.out.println("1");
		
		else {
			for(int i=1;i<=t;i++) {
				
				c=a+b;
				
				temp=b;
				
				b=c;
				a=temp;
			}

			System.out.println(c);
		}
		
	}//main 끝
	
}

