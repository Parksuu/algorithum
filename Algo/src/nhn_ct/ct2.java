package nhn_ct;

import java.util.*;

public class ct2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int idx[] = new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> qu = new ArrayList<Integer>();
		
		int dequ = -1;
		for(int i=0;i<n+1;i++) {
			String ar[] = new String[2];
			ar = sc.nextLine().split(" ");
			
			if(ar[0].equals("enqueue")) {
				int a = Integer.parseInt(ar[1]);
				list.add(a);
				idx[a]++;
			}
			
			else
				dequ++;	
		}
		
		System.out.println(list);
		
		int max = idx[0];
		int max_idx = 0;
		int max_fir_idx = 0;
		int temp = 0;
		boolean check = false;
		
		for(int i=0;i<dequ;i++) {
			for(int j=0;j<idx.length;j++) {
				if(max < idx[j]) {
					max = idx[j];
					max_idx = j;
				}
				if(max == idx[j]) {
					max_fir_idx = max_idx;
					check=true;
				}
				
			}
			if(check == false) {
				int num = list.remove(max_idx); // 제거해주고
				qu.add(num);
				idx[max_idx]--;
			}
			
			else {//true라면4-
				int num = list.remove(max_fir_idx);
				qu.add(num);
				idx[max_fir_idx]--;
			}
		
		
		}
		
		for(int i=0;i<qu.size();i++) {
			System.out.print(qu.get(i) + " ");
		}
	}
	
}
