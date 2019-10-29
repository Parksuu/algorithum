import java.util.*;

public class programmers_2_가장큰수 {

    public String solution(int[] numbers) {

        String arr[] = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
         Arrays.sort(arr,new Comparator<String>(){
             public int compare(String s1, String s2){
                 return (s2+s1).compareTo(s1+s2);
                 //두 string을 합하여 더 큰쪽이 우선순위가 있도록
             }

        
        });
        
        //제일 큰게 영? -> 전부 0이면 0000 이니까
        if(arr[0].equals("0"))
            return "0";
        
        String answer = "";
        
        for(int i=0;i<arr.length;i++)
            answer = answer+ arr[i];
     
        return answer;
    }
}
