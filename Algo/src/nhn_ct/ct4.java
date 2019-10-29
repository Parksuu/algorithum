package nhn_ct;

import java.util.*;

public class ct4 {

	static ArrayList<String> list = new ArrayList<String>();
	
	public static void perm(int[] arr, int depth, int n, int k) {
		if (depth == k) {
			print(arr,k); 
			return;
			}
		
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth); 
			} 
	}

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
	
	public static int calc(String s) {
		int arr[] = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		
		int sum = 0;
		for(int i=0;i<arr.length-1; i++) {
			int temp1 = arr[i];
			int temp2 = arr[i+1];
			
			int temp3 = temp1-temp2;
			
			if(temp3<0)
				temp3 = temp3 * (-1);
			
			sum = sum + temp3;
		}
		return sum;
	}
	
	static public int sol(int v[]) {
		int answer = 0;

		perm(v, 0, v.length, v.length);
		int arr[] = new int[50000]; //5¸¸°³

		
		for(int i=0;i<list.size();i++) {
			arr[i] = calc(list.get(i));
		}
		
		
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max)
				max = arr[i];
		}
		
		System.out.println("plz"+ max);
		
		
		return max;
	}
	
	public static void main(String[] args) {
		int v[] = {20,8,10,1,4,15};
		sol(v);
	}
}
