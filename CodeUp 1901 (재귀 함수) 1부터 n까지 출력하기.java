import java.util.*;
import java.io.*;

public class Main {
	   
		
		static public void fuc(int n) {

			if(n==1) {
				System.out.println("1");
				return;
			}
			
			else {
			fuc(n-1);
			System.out.println(n);
			
			}
			
		}
	
		 public static void main(String[] args) {
			
			 Scanner sc = new Scanner(System.in);
			 
			 int n = sc.nextInt();
			 
			 fuc(n);
			 
		 }
}
