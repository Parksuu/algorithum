import java.util.*;

public class beak_5622_���̾� {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String ss[] = s.split("");
		int answer = 0;
		
		for(int i=0; i<ss.length; i++) {
			String a = ss[i];
			
			if(a.equals("A")||a.equals("B")||a.equals("C"))
				answer = answer + 2;
			if(a.equals("D")||a.equals("E")||a.equals("F"))
				answer = answer + 3;
			if(a.equals("G")||a.equals("H")||a.equals("I"))
				answer = answer + 4;
			if(a.equals("J")||a.equals("K")||a.equals("L"))
				answer = answer + 5;
			if(a.equals("M")||a.equals("N")||a.equals("O"))
				answer = answer + 6;
			if(a.equals("P")||a.equals("Q")||a.equals("R")||a.equals("S"))
				answer = answer + 7;
			if(a.equals("T")||a.equals("U")||a.equals("V"))
				answer = answer + 8;
			if(a.equals("W")||a.equals("X")||a.equals("Y")||a.equals("Z"))
				answer = answer + 9;
		}
		
		answer = answer + ss.length;
		
		System.out.println(answer);
	}
}
