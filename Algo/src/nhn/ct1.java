package nhn_ct;

import java.util.*;

public class ct1 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		String s[] = new String[n];
		
		for(int i=0;i<n; i++)
			s[i] = sc.next();
		
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(s[i])) {
				int m = map.get(s[i]);
				map.put(s[i], ++m);
			}
			else
				map.put(s[i], 1);
		}
		
		int min = map.get(s[0]);

		int all = 0;
		for(String key: map.keySet()) {
			all += map.get(key);
			list.add(map.get(key));
			if(map.get(key)<min)
				min = map.get(key);
		}
		
		int max = list.get(0);
		int idx = 0;
		for(int i=1;i<list.size();i++) {
			if(max <list.get(i))
				idx = i;
		}
		
		
		
		int minn = min;
		boolean check = false;
		int j = list.get(0);
		for(int i=1;i<list.size();i++) {
			if(list.get(i)==j){
				j = list.get(i);
			}
			else {
				check = true;
				break;
			}
		}
		
		boolean once = false;
		if(check == false) { //������ ���� ������ ¦�̸�
			System.out.println("Y");
			System.out.println(all);
			System.out.println(map.size());
		}
		else {//�ּҰ��� �����ͼ� +1���Ѽ� �´��� ��
			list.add(min+1);
			boolean check1 = false;
			int temp = list.get(idx);
			for(int i=0;i<list.size();i++) {
				int k = list.get(i);
				if(k==minn && once==false) {//min�� ���°ɷ� üũ
					once=true;
					continue;
				}
				if(k==temp){
				}
				else {
					check1 = true;
					break;
				}
				
				temp = k;
			}
			
			
			if(check1 == false) { //������ ���� ������ ¦�̸�
				all = all+1;
				System.out.println("Y");
				System.out.println(all);
				System.out.println(map.size());
			}
			else if(check1 == true) {
				System.out.println("N");
				System.out.println(all);
				System.out.println(map.size());
			}
			
		}
		
	}
}