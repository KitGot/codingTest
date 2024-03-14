class Solution {
	public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder copy = new StringBuilder();
        for(int i = 1;i<food.length;i++){
            if(food[i] == 1) continue;
            for(int j = 0 ;j < food[i]/2;j++){
                answer.append(i);        
            }
        }
        
        copy.append(answer.toString());
        copy.append("0");
        answer.reverse();
        copy.append(answer);
	    return copy.toString();
	}
}