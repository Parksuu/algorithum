import java.util.*;

public class beak_1182_�κм������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int arr[] = new int[a];
		
		for(int i=0;i<a; i++)
			arr[i] = sc.nextInt();
		
		int answer = 0;
		
		for(int i=1; i< (1<<a); i++) {
			int sum = 0;
			for(int j=0; j<a; j++) {
				if((i&(1<<j)) !=0) //0�� ���� ���� �����ϱ�
					sum = sum+arr[j];
			}

			if(sum == b)
				answer++;
		}
		
		
		System.out.println(answer);
	}
}
