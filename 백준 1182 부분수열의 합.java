import java.util.*;

public class Main {
 
	static int arr[];
	static boolean visited[];

	static int count=0;
	static int m;
	static int trash = 0;
	
    static void pow(int[] arr, boolean[] visited, int n, int idx) {
        if(idx == n) {
            print(arr, visited, n);
            return;
        }
 
        visited[idx] = false;
        pow(arr, visited, n, idx + 1);

        visited[idx] = true;
        pow(arr, visited, n, idx + 1);
    }
 
    static void print(int[] arr, boolean[] visited, int n) {
    	
    	int result=0;

    	for(int i=0; i<n; i++) {
	            if(visited[i] == true) {
	                //System.out.print(arr[i] + " ");
	                result=arr[i]+result;
	            }
	            
	     }
    	//System.out.println("result =>" + result);
    	if(result==m && trash!=0)
        	count++;

    	trash++;
}
    
    
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	m = sc.nextInt();
    	
    	visited = new boolean[n];
    	arr = new int[n];
    	
    	for(int i=0;i<n;i++)
    		arr[i]=sc.nextInt();
    	
        pow(arr, visited, n, 0);
        
    	
    	System.out.println(count);
    }
}
