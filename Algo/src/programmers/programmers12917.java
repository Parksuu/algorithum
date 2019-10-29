import java.util.Arrays;
import java.util.Collections;


public class programmers12917 {

	  public String solution(String s) {
	      String arr[] = s.split(""); //배열로만들고
	      Arrays.sort(arr);//배열을 정렬
	      Collections.reverse(Arrays.asList(arr)); //역으로 정렬하기위해 배열을 리스트로만들고
	      
	      return String.join("", arr); //리스트를 다시 string으로 join해줌
	  }
	
	public static void main(String args[]) {
	
		String.valueOf('c');
		
		
	}	
}
