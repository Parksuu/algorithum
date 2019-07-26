import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int n = 0;
        for(int i=0;i<commands.length;i++) {
        	
        	ArrayList<Integer> list = new ArrayList<>();
        	
        	int a = commands[i][0]; //i
        	int b = commands[i][1]; //j
        	int c = commands[i][2]; //k
 
        	for(int j = a-1; j<b; j++)
        		list.add(array[j]);
        	
        	list.sort(null);
        	answer[n] = list.get(c-1);
        	n++;
        }

        return answer;
    }
}
