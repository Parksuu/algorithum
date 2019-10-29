//시뮬레이션

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

public class beak_15685_드래곤커브 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Dragon> all = new ArrayList<Dragon>(); //전체 좌표 저장
		ArrayList<Integer> Dir = new ArrayList<Integer>();//1개의 드래곤 방향 저장
		
		int num = sc.nextInt();
		
		//세대에 따라 방향 저장해놓기
		for(int i=0;i<num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			all.add(new Dragon(x,y));
			
			int dir = sc.nextInt();
			int gen = sc.nextInt();
			
			Dir.add(dir);//0세대
			
			//세대만큼 방향 구해서 저장해놓기
			for(int j=0;j<gen;j++) {
				for(int k = Dir.size()-1; k>=0; k--) {
					dir = (Dir.get(k)+1) % 4;
					Dir.add(dir);
				}//k -for
			}//j - for
			
			int map[][] = new int[101][101];
			
			//Dir에 방향 다 넣어놓았으면, 좌표를 움직이기
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
			
			Dir.clear();//초기화
		}//i - for
		
		int map[][] = new int[101][101];
		for(int i=0;i<all.size();i++) {
			map[all.get(i).x][all.get(i).y] = 1;
		}
		
		int answer = 0;
		//!!!!!!좌표는 100까지있지만 99까지만 처리가 가능하기때문에 <100 해줘야함
		for(int i=0;i<100;i++) {
			for(int j=0;j<100; j++) {
	            if (map[i][j] == 1 && map[i + 1][j] == 1 && map[i][j + 1] == 1 && map[i + 1][j + 1] == 1)
	                answer++;
			}
		}
		
		System.out.println(answer);
	}
}
