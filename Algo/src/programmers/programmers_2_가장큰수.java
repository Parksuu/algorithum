import java.util.*;

public class programmers_2_����ū�� {

    public String solution(int[] numbers) {

        String arr[] = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
         Arrays.sort(arr,new Comparator<String>(){
             public int compare(String s1, String s2){
                 return (s2+s1).compareTo(s1+s2);
                 //�� string�� ���Ͽ� �� ū���� �켱������ �ֵ���
             }

        
        });
        
        //���� ū�� ��? -> ���� 0�̸� 0000 �̴ϱ�
        if(arr[0].equals("0"))
            return "0";
        
        String answer = "";
        
        for(int i=0;i<arr.length;i++)
            answer = answer+ arr[i];
     
        return answer;
    }
}
