import java.util.*;

public class pq_test {
	
	static class Point implements Comparable<Point>{
		int index;
		int weight;
		
		Point(int index, int weight){
			this.index = index;
			this.weight = weight;
		}
		
//		public int compareTo(Point p) {
//			if(this.index == p.index)
//				return 0;
//			else if(this.index > p.index)
//				return 1;
//			else
//				return -1;
//		}
		
		public int compareTo(Point p) {
			if(this.weight == p.weight)
				return 0;
			else if(this.weight > p.weight)
				return 1;
			else
				return -1;
		}
	}
	
	public static void main(String[] args) {
		int test[][] = {{5,4},{8,1},{2,7}};
		
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		
		Point p1 = new Point(test[0][0],test[0][1]);
		Point p2 = new Point(test[1][0],test[1][1]);
		Point p3 = new Point(test[2][0],test[2][1]);
		
		//pq는 우선순위 큐이고 우선수위를 정하는건 <Integer> <String>등의 타입을 사용해도 되고
		//객체를 사용한 우선순위를 정하려면 0)그 클래스에 compareTo를 구현후 1)어떤 인자를 기준으로 2)내림,오름 할지정하면 3)걔에 맞춰서 알아서 pq가 우선순위큐를 만들어준다
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		
		
		Point an1 = pq.poll();
		System.out.print(an1.index+ ", ");
		System.out.println(an1.weight);
		
		Point an2 = pq.poll();
		System.out.print(an2.index + ", ");
		System.out.println(an2.weight);
		
	}
	
}
