import java.util.LinkedList;
import java.util.*;
 
//1158 조세퍼스
public class Main {
    
    static int n;
    static int m;
    static StringBuilder str = new StringBuilder();
 

    public static void jo(LinkedList<Integer> list){
        
        int cnt = 0;
        
        while(n>0){
            for(int i=0; i<m-1; ++i){
                ++cnt;
                if(cnt > n-1) //kill이 총 개수보다 크면 셀수없으므로 그때도 0으로 초기화해서 센다
                	cnt=0;
            }
            
            str.append(list.get(cnt)+", ");
            list.remove(cnt);
            
            if(cnt == list.size()) //list랑 size 같아지면 다시 0으로 초기화해서 0부터 m개 센다
            	cnt=0;
            
            n--;
        }
    }
    
    
    
    public static void main(String[] args){
        
    	Scanner sc = new Scanner(System.in);
        
        str.append("<");
        n = sc.nextInt();
        m = sc.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; ++i)
            list.add(i);
        
        jo(list);
        
        //System.out.println(str + ">");
        System.out.println(str.toString().substring(0,str.length()-2)+">"); //, 까지 append 돼서 len-2에 >추가
    }
    

}
