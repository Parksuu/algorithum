import java.util.Arrays;
import java.util.Collections;


public class programmers12917 {

	  public String solution(String s) {
	      String arr[] = s.split(""); //�迭�θ����
	      Arrays.sort(arr);//�迭�� ����
	      Collections.reverse(Arrays.asList(arr)); //������ �����ϱ����� �迭�� ����Ʈ�θ����
	      
	      return String.join("", arr); //����Ʈ�� �ٽ� string���� join����
	  }
	
	public static void main(String args[]) {
	
		String.valueOf('c');
		
		
	}	
}
