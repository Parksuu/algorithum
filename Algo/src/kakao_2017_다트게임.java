import java.util.*;

public class kakao_2017_��Ʈ���� {

	static public int solution(String dartResult) {
	      String result[] = dartResult.split("");
	      ArrayList<Integer> num = new ArrayList<Integer>();
	      
	      int a = 0;
	      for(int i=0;i<dartResult.length();i++) {
	    	  String r = result[i];//�ϳ��� �����ͼ�
	    	  //����
	    	  if(r.equals("1") ||r.equals("2")||r.equals("3")||r.equals("4")||r.equals("5")
	    	   ||r.equals("6")||r.equals("7")||r.equals("8")||r.equals("9")||r.equals("0"))
	    	  {
	    		  a = Integer.parseInt(r);
	    		  if(result[i+1].equals("0")) {
	    			  a = 10;
	    			  i++;
	    		  }
	    	  }
	    	  //SDT
	    	  if(r.equals("S") || r.equals("D") || r.equals("T")) {
	    		  if(r.equals("S"))
	    			  num.add(a);
	    		  if(r.equals("D"))
	    			  num.add(a*a);
	    		  if(r.equals("T"))
	    			  num.add(a*a*a);
	    	  }
	    	  //�ɼ�
    		  if(num.size()==1 && r.equals("*")) //�տ� �ƹ��͵� ������ �� �ڽŸ� �ι�����
    			  num.set(0, a*2);
    		  
    		  else if(num.size() !=1 && r.equals("*")) {//�տ� ���� ������ �¶� ���� �ι�
    			  num.set(num.size()-2, num.get(num.size()-2) *2);
    			  num.set(num.size()-1, num.get(num.size()-1) *2);
    		  }
    		  
    		  if(r.equals("#"))
    			  num.set(num.size()-1, num.get(num.size()-1) *(-1));
	    		  
	      }//for
	      
	      int answer = 0;
	      for(int i=0;i<3;i++)
	    	  answer = answer + num.get(i);
	      
	      return answer;
	}
	
	public static void main(String[] args) {
		String s = "3S3D3T";
		
		System.out.println(solution(s));
	}
}
