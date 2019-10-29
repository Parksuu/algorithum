package kakao_ct;

import java.util.*;

public class line_2 {

	static ArrayList<String> list = new ArrayList<String>();
	
	public static void perm(int[] arr, int depth, int n, int k) {
		if (depth == k) { // �ѹ� depth �� k�� �����ϸ� ����Ŭ�� ������. �����.
			print(arr,k); 
			return;
			}
		
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth); 
			} 
	} // �ڹٿ����� �����Ͱ� ���� ������ �Ʒ��� ����, �ε��� i�� j�� ���� �ٲ���. 
	
	public static void swap(int[] arr, int i, int j) { 
		int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
	
	public static void print(int[] arr, int k) { 
		String ss = "";
		for (int i = 0; i < k; i++) { 
			if (i == k - 1)
				ss = ss+ String.valueOf(arr[i]);
			else
				ss = ss+ String.valueOf(arr[i]);
		}
		list.add(ss);
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       
        int arr[] = new int[(s.length()/2) + 1];
        
    	int j=0;
        for(int i=0; i < s.length(); i++) {
        	String ss = String.valueOf(s.charAt(i));
        	if(!ss.equals(" ")) {
        		arr[j] = Integer.parseInt(ss);
        		j++;
        	}
        	
        }
		
        perm(arr,0,(s.length()/2) + 1,(s.length()/2) + 1);
        
        list.sort(null);        
        int b = sc.nextInt();

        System.out.println(list.get(b-1));
        
    }
}
