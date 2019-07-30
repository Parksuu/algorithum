import java.util.*;
import java.io.*;

class Main {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 
		 for(int i=0;i<size;i++) {
			 
			 String n = sc.next();
			 int num = 0;
			 
			 for(int j=0;j<n.length()/2 ; j++) {
				if(n.charAt(j) == n.charAt(n.length()-1-j)) {
					num++;
					if(num == n.length()/2)
						System.out.println("#"+(i+1) + " 1");
					
					continue;
				}
				
				else {
					System.out.println("#"+(i+1) + " 0");
					break;
				}
					
			 }
			 
		 }
		 
	 }
}
