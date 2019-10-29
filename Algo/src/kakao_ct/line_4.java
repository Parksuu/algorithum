package kakao_ct;

import java.util.*;

public class line_4 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        
        int zero[] =new int[a];
        
        for(int i=0; i<a; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int idx = 0;
    	int prev = 0;        
        for(int i=0;i<a;i++) {
        	
        	if(arr[i] ==1) {
        		prev = 1;
        		continue;
        	}
        	
        	if(i==0 && arr[0]==0) {
        		idx=i;
        		zero[idx]++;
        		prev = 0;
        	}
        	
        	if(prev == 0 && arr[i] == 0) {
        		zero[idx] ++;
        		prev = arr[i];
        	}
        	
        	else if(prev ==1 && arr[i] ==0) {
        		idx = i;
        		zero[idx] ++;
        		prev = arr[i];
        		
        	}
        }
                
        int max_idx = 0;
        for(int i=0;i<zero.length;i++) {
        	max_idx =Math.max(max_idx, zero[i]);
        }
        
        if((max_idx%2)==0)
        	System.out.println(max_idx/2);
        
        if((max_idx%2)!=0)
        	System.out.println(max_idx/2 +1);
        
        
    }
}
