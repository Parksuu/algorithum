import java.util.*;

public class Main {
    public static void main(String[] args) {
        int test_case;
        Scanner In = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        test_case = In.nextInt();

        for(int i=0; i<test_case; i++) {
            int N; //현재 queue의 사이즈
            int myInx; // 현재 queue의 내 문서위치인덱스
            int number;
            int cnt = 0;
            int ans;

            N = In.nextInt();
            myInx = In.nextInt();

            for(int j=0; j<N; j++) {
                number = In.nextInt();
                list.add(number);	
            }

            while(true) {

                int front = list.get(0);
                boolean flag = false;


                // 3 4 5 6 7
                // 1 1 9 1 1
                for (int k = 1; k < N; k++) {
                    if( front < list.get(k) ) {
                        flag = true;
                        break;
                    }
                }

                if(flag == true){
                    // 뒤에 front 보다 큰 값이 있는경우
                    if(myInx == 0) {
                        myInx = N-1;
                    }
                    else {
                        myInx--;
                    }
                    list.add(list.get(0));
                    list.remove(0);
                }
                else {
                    // 뒤에 front 보다 작거나 같은경우
                    cnt++;
                    if(myInx == 0) {
                        ans = cnt;
                        break;
                    }
                    else {
                        myInx -= 1;
                    }
                    list.remove(0);
                    N -= 1;
                }
            }
            System.out.println(ans);
            list.clear();
        }
    }
}
