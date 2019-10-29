import java.util.*;

public class Main {
	
	
	static int heap[] = new int[1000001];
	static int heapsize = 1;
	
	
	static void swap(int arr[], int a, int b) {
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	static void heap_insert(int num) {
		
		//heap 생성 & 삽입
		heap[heapsize++]=num; //들어온 num값을 heap에 넣어준다
		
		int nowIdx = heapsize-1;
		
		while(nowIdx!=1) { //nowIdx가 하나라면 부모와 자식관계를 비교할 필요 없으니까 넘어간다
			if(heap[nowIdx]<heap[nowIdx/2])//부모가 자식보다 크면, 들어온 값이 부모보다 작다면 계속 위로 올라간다
			{
				swap(heap,nowIdx,nowIdx/2); //내용물을 바꿔주고
				nowIdx=nowIdx/2; //부모자리로 올라갔다면 다시한번 부모와 비교해주기 위해서 자신의 바뀐 idx값도 지정해준다
			}
			else
				break;
		
		}
		
		
		
	}
	
	static void heap_sort(int arr[]) {
		
		if(heapsize==1) //heapsize가 1이면 하나니까 sort할 필요 없음
			return;
		
		swap(heap,1,heapsize-1);
		heapsize--; //heap의 맨 마지막을 없애는 것
		
		int nowIdx =1;
		
		while(true) {
			
			int priority=-1; // nowIdx와 비교할 자식을 정한다!!
			
			//nowIdx와 비교할 자식을 정한다!
			if(heapsize<= nowIdx*2) //나의 왼쪽자식의 인덱스보다 작거나 같다면 no left, right child
				break;
			
			else if(heapsize<=nowIdx*2+1) //나의 오른쪽 자식의 인덱스보다 작거나 같다면 left 존재
				priority=nowIdx*2; //left만 존재하니까 priority에 left넣고 now와 priority 비교
			
			else //left와 right 둘 다 존재하니까, 둘 중 작은애를 priority에 넣고 now와 비교한다
			{
				if(heap[nowIdx*2]<heap[nowIdx*2+1]) //left가 작은 경우 priority에 넣는다
					priority=nowIdx*2;
				else
					priority = nowIdx*2+1; //right가 작은 경우 priority에 넣는다
			}
			
			//priority가 정해지면 nowIdx랑 비교한다
			if(heap[priority]<heap[nowIdx]) {
				swap(heap,priority,nowIdx);
				nowIdx=priority;
			}
			else
				break;
			
		}//while 끝
	}
	
	

	static int pop() {
		return heap[1]; //작은 수부터 root에 있으니까 1번째 꺼냄
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//배열 개수 받기
		
		for(int i=0; i<num ;i++) {
			
			//문자를 받는대로 바로 sort 함수로 넘겨버리기
			heap_insert(sc.nextInt());
			
		}
		
		
		for(int i=0;i<num;i++) {
			System.out.println(pop());
			heap_sort(heap);
		}

		
	}//main 끝
	
}
