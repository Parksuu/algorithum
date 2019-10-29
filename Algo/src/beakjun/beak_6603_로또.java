//백트레킹

import java.util.*;

public class beak_6603_로또 {


	public static void combination(List<Integer> list, int len, int r, int piv) {	
		
		if(r == 0)//기저조건
		{
			for(int i=len;i<list.size();i++)
				System.out.print(list.get(i) + " ");
			
			System.out.println();
			return;
		}
		
		for(int i=piv; i<len;i++) {
			list.add(list.get(i));
			combination(list,len,r-1,i+1);//기저까지 다 돌고
			list.remove(list.size()-1);//다 돌고 나오면 맨마지막거 지워준다
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int num = sc.nextInt();
			
			if(num == 0)
				return ;
			
			for(int i=0;i<num;i++) {
				list.add(sc.nextInt());
			}

			combination(list, num, 6, 0);
		
			System.out.println();
			
			while(list.size() !=0)
				list.remove(0);
		}
		
	}
}
