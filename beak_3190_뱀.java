import java.util.*;

public class beak_3190_뱀 {
	
	//changeDir에서 n = 0,1,2,3만 잘 정하면 그방향으로 gox[n], goy[n] 해주면 된다
	static int gox[] = {-1, 0, 1, 0};
	static int goy[] = { 0, 1, 0,-1};
	
	static class Pos{
		int x;
		int y;
		
		//생성자
		public Pos(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int changeDir(int cur_dir, char c) {
		int new_dir;
		
		//오른쪽이면 -->  북에서 오른쪽은 1, 동에서 2, 남에서 3, 서에서 0
		if(c == 'D'){
			if(cur_dir==3)
				new_dir = 0;
			else
				new_dir = ++cur_dir;
		}
		
		//왼쪽이면-->  북에서 왼쪽은 3, 동에서  0, 남에서 1, 서에서 2
		else {
			if(cur_dir==0)
				new_dir=3;
			else
				new_dir = --cur_dir;
		}
		
		return new_dir;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //보드 크기
		int wall[][] = new int[n+2][n+2]; //1부터 시작하려고
		int time = 0 ;//시간
		int dir = 1; //이동방향, 처음에는 gox[1] gy[1]인 동쪽으로 이동하니까
		
		Queue<Pos> bam = new LinkedList<Pos>();
		char inst[] = new char[100001]; //명령어
		
		//벽 ->2
		for(int i=0;i<n+2; i++) {
			for(int j=0;j<n+2; j++) {
				if(i==0 || j==0 || i==n+1 || j==n+1)
					wall[i][j] = 2; //0번째 행,열과 n+1번째 행,열을 벽으로 만들어줌
			}
		}
		
		//사과 ->1
		int k = sc.nextInt(); //사과 개수
		for(int i=0;i<k; i++) {
			wall[sc.nextInt()][sc.nextInt()]=1;
		}
		
		//명령어를 inst[n]번째 자리에 넣어주겠다
		int l = sc.nextInt(); //명령어 개수
		for(int i=0; i<l; i++) {
			inst[sc.nextInt()] = sc.next().charAt(0); //string으로 받아서 0번쨰 char로 변환
		}
		
		//cur_pos는 머리
		Pos cur_pos = new Pos(1,1); //머리 1,1에서 시작!!!!!!!!!
		bam.offer(new Pos(1,1)); //머리 넣고
		wall[cur_pos.x][cur_pos.y] = 2; // 머리 있는 자리 쪽으로는 못가니까 2로 설정

		while(true) {
			++time;
		
			//1) 뱀의 머리 위치 이동
			cur_pos.x = cur_pos.x + gox[dir];
			cur_pos.y = cur_pos.y + goy[dir];


			//3) 사과가 있으면 그대로 bam큐에 넣으면 되는데, 빈칸인 경우에는 맨 마지막 꼬리 비워준다
			if(wall[cur_pos.x][cur_pos.y] ==0) {
				Pos tail = bam.poll(); //뱀 꼬리 비우고
				wall[tail.x][tail.y] = 0; //꼬리 없어졌으니까 빈공간으로 만들어준다
			}
			
			
			//2) 이동 후, 벽이나 뱀의 몸이면 종료
			if(wall[cur_pos.x][cur_pos.y]==2) 
				break;
		
			//4) 머리를 큐에 넣어준다
			bam.offer(new Pos(cur_pos.x,cur_pos.y));
			wall[cur_pos.x][cur_pos.y] = 2; //이동한 머리부분을 2로 바꿔줌
			
			//5)방향 바꿈
			if(inst[time] =='D' || inst[time] =='L')
				dir = changeDir(dir,inst[time]);
		}
		
		System.out.println(time);		
	}
}