import java.util.*;

public class Main {
    	
	static void swap(int arr[],int idx1, int idx2) {
		
		int temp = arr[idx1];
		arr[idx1]= arr[idx2];
		arr[idx2]= temp;
		
	}
	
	
	static int[] bubble_sort(int arr[],int n) {
		//끝에서 앞으로 비교하고 교환한다
		
		for(int i=0;i<n;i++) {
			int ch=0;
			for(int j=n-1;j>i;j--) { // 맨 뒤 n-1, n-2부터 앞으로 하나씩 비교, i번째는 정렬되어있는것으로 가정하고 i+1까지
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
					ch++;
				}
			}
			
			if(ch==0) break; //정렬이 다 되어있어도 i+1, i+2, i+3 ...이렇게 다 도는데 이미 정렬이 되어있다면
							//ch를 가지고 swap하는게 없으면 정렬이 끝났다는 거니까 바로 바깥 for문을 빠져나온다
			
		}	
		
		return arr;
	}
	
	
	public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt(); //배열로 받고
		}
		
		arr=bubble_sort(arr,n);
		
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
    }//main 끝
}
