//��Ʈ��ŷ

import java.util.*;

public class beak_6603_�ζ� {


	public static void combination(List<Integer> list, int len, int r, int piv) {	
		
		if(r == 0)//��������
		{
			for(int i=len;i<list.size();i++)
				System.out.print(list.get(i) + " ");
			
			System.out.println();
			return;
		}
		
		for(int i=piv; i<len;i++) {
			list.add(list.get(i));
			combination(list,len,r-1,i+1);//�������� �� ����
			list.remove(list.size()-1);//�� ���� ������ �Ǹ������� �����ش�
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
