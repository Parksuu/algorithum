import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class naver_coding_test_1 {
	
	public static void main(String args[]) {
	
		String test[] = {"abc.def@x.ccom"};
		
		String pattern = "^[a-z.]+@[a-z]+(.com||.org||.kr)$";
		int answer = 0;
		
		for(int i=0;i<test.length;i++) {
			boolean j = Pattern.matches(pattern, test[i]);
			if(j==true)
				answer++;
		}
	
		System.out.println(answer);
	}
}
