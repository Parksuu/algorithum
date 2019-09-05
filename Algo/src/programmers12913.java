
public class programmers12913 {
	
	static int maxx(int num1, int num2, int num3) {
		int max=0;
		
        if (num1 >= num2 && num1 >= num3) 
            max = num1;
        else if (num2 >= num1 && num2 >= num3)
            max = num2;
        else
            max = num3;

		return max;
	}
	
	
	static int solution(int[][] land) {
        int answer = 0;
         
        int size = land.length-1; //���� ����-1

        for(int i=0;i<size;i++) {
        	//i+1��° �� 0��° ������ i��° �࿡ 1,2,3 ���� �ִ밪�� �����ش�.
        	//�������� ������ 1,2,3,4, �ִ� ��
        	
        	land[i+1][0] = land[i+1][0] + maxx(land[i][1], land[i][2], land[i][3]);
        	land[i+1][1] = land[i+1][1] + maxx(land[i][0], land[i][2], land[i][3]);
        	land[i+1][2] = land[i+1][2] + maxx(land[i][0], land[i][1], land[i][3]);
        	land[i+1][3] = land[i+1][3] + maxx(land[i][0], land[i][1], land[i][2]);
        }
        
        //������ ���� 1,2,3,4 ������ �ִ� ���� ������. �� �� max�� answer�� �ִ´�
        for(int i=0; i<4; i++)
        	answer = Math.max(answer, land[size][i]);
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	int land[][] = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
    	System.out.println(solution(land));
    	
	}
}