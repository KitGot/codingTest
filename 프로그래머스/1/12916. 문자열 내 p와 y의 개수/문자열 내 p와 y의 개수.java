class Solution {
  	 boolean solution(String s) {
		    String answer = s.toLowerCase();
            int pCount = 0;
            int yCount = 0;
            for(char a : answer.toCharArray()){
                if(a == 'p') pCount++;
                if(a == 'y') yCount++;
            }
        return pCount == yCount;

		    }
}