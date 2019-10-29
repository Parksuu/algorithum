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
		
		//pq�� �켱���� ť�̰� �켱������ ���ϴ°� <Integer> <String>���� Ÿ���� ����ص� �ǰ�
		//��ü�� ����� �켱������ ���Ϸ��� 0)�� Ŭ������ compareTo�� ������ 1)� ���ڸ� �������� 2)����,���� �������ϸ� 3)�¿� ���缭 �˾Ƽ� pq�� �켱����ť�� ������ش�
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
