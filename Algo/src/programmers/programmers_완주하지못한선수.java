import java.util.*;
import java.io.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
		HashMap map = new HashMap<String, Integer>();
		
		for(int i=0;i<participant.length;i++) {
			
			if(map.containsKey(participant[i])) {
				int num = (int) map.get(participant[i]);
				map.put(participant[i],++num);
			}
			else
				map.put(participant[i],1);
		}
		
		for(int i=0;i<completion.length;i++) {
			if(map.containsKey(completion[i])) {
				if((int)map.get(completion[i]) == 1)
					map.remove(completion[i]);
				else {
					int num = (int) map.get(completion[i]);
					map.put(completion[i],num-1);
				}
			}
		}
		
		Iterator<String> keys = map.keySet().iterator();
		
		String answer="";
		
		while(keys.hasNext()) {
			String key = keys.next();
			answer = key;
		}
		
		
		return answer;
    }
}
