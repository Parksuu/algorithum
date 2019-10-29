package kakao_ct;

import java.util.*;

public class line_3 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int arr[][] = new int[a][2]; //두개 넣는 배열 만듦
        
        for(int i=0;i<a; i++) {
        	for(int j=0; j<2;j++)
        		arr[i][j] = sc.nextInt();
        }
        
        int total = 0;
        
        for(int i=1;i<a;i++) {
        		if(arr[i-1][0] + arr[i-1][1] > arr[i][0])
        			total = total +2;
        		if(arr[i-1][0] + arr[i-1][1] == arr[i][0])
        			total --;
        		if(arr[i-1][0]+arr[i-1][1] < arr[i][0])
        			total--;
        }
        
        System.out.println(total);
        
    }
}
