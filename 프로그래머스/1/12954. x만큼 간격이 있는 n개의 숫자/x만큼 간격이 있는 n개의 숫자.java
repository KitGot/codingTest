import java.util.ArrayList;

class Solution {
   public static long[] solution(int x, int n) {
	        long[] answer;
	        ArrayList<Long> list = new ArrayList<>();
	        for(int i=1;i<=n;i++) {
	        		list.add((long)i * x);	
	        }
	        
	        answer = new long[list.size()];
	        int j = 0;
	        while(!list.isEmpty()) {
	        	answer[j++] = list.remove(0);
	        }        
			return answer;
	    }
	

}