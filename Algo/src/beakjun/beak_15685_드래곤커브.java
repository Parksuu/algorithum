//�ùķ��̼�

import java.util.*;

class Dragon{
	int x;
	int y;
	
	Dragon(){
		
	}
	
	Dragon(int x,int y){
		this.x = x;
		this.y = y;
	}
	
}

public class beak_15685_�巡��Ŀ�� {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Dragon> all = new ArrayList<Dragon>(); //��ü ��ǥ ����
		ArrayList<Integer> Dir = new ArrayList<Integer>();//1���� �巡�� ���� ����
		
		int num = sc.nextInt();
		
		//���뿡 ���� ���� �����س���
		for(int i=0;i<num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			all.add(new Dragon(x,y));
			
			int dir = sc.nextInt();
			int gen = sc.nextInt();
			
			Dir.add(dir);//0����
			
			//���븸ŭ ���� ���ؼ� �����س���
			for(int j=0;j<gen;j++) {
				for(int k = Dir.size()-1; k>=0; k--) {
					dir = (Dir.get(k)+1) % 4;
					Dir.add(dir);
				}//k -for
			}//j - for
			
			int map[][] = new int[101][101];
			
			//Dir�� ���� �� �־��������, ��ǥ�� �����̱�
			for(int j=0;j<Dir.size(); j++) {
				dir = Dir.get(j);
				if(dir == 0)
					x = x+1;
				if(dir == 1)
					y = y-1;
				if(dir ==2)
					x = x-1;
				if(dir ==3)
					y = y+1;
				
				all.add(new Dragon(x,y));
			}
			
			Dir.clear();//�ʱ�ȭ
		}//i - for
		
		int map[][] = new int[101][101];
		for(int i=0;i<all.size();i++) {
			map[all.get(i).x][all.get(i).y] = 1;
		}
		
		int answer = 0;
		//!!!!!!��ǥ�� 100���������� 99������ ó���� �����ϱ⶧���� <100 �������
		for(int i=0;i<100;i++) {
			for(int j=0;j<100; j++) {
	            if (map[i][j] == 1 && map[i + 1][j] == 1 && map[i][j + 1] == 1 && map[i + 1][j + 1] == 1)
	                answer++;
			}
		}
		
		System.out.println(answer);
	}
}
