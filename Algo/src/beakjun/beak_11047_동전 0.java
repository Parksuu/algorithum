import java.util.*;
import java.io.*;

public class Main {
	
	
	
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 int arr[] = new int[a];
		 
		 for(int i=0; i<a; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 //여기서 함수 만들기
		 int count=0;
		 
		 for(int i=a-1; i>=0; i--) {
			 
			 int num=0;
			 
			 if(arr[i]>b)
				 continue;
			 
			 //아니라면
			 else{
				 
				 num = b%arr[i];
				 count = count + (b/arr[i]);
				 
				 b = num;
				 
				 if(num==0)
					break;
			 }
		 }
		 
		 System.out.println(count);
		 
	 }
}
