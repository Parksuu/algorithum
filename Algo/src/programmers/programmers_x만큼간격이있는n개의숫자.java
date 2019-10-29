import java.util.*;
import java.io.*;

class Solution {
 
		static public long[] solution(int x,int y) {
			long[] answer = new long[y];
			
			long num = 0;
			long sum = 0;

			if(x>0) {
				for(int i=0; i<y; i++) {
					sum = sum+x;
					answer[i] = sum;
					num++;
				}
			}
			
			else {
				for(int i=0;i<y;i++) {
					sum = sum+x;
					answer[i] = sum;
					
					num++;
				}
				
			}
			
			return answer;
		}
}
