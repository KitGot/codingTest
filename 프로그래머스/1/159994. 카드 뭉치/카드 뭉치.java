class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int cards1Index = 0;
        int cards2Index = 0;
        int goalIndex = 0;
        
        while(goalIndex < goal.length){
            if(cards1Index < cards1.length && cards1[cards1Index].equals(goal[goalIndex])){
                cards1Index++;
                goalIndex++;
            }else if(cards2Index < cards2.length && cards2[cards2Index].equals(goal[goalIndex])){
                cards2Index++;
                goalIndex++;
            }else{
                return "No";
            }
        } 
        return answer;
    }
}