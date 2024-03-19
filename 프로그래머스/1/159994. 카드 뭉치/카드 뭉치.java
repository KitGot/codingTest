class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int len = cards1.length;
        int len2 = cards2.length;
        String answer = "Yes";
        int indexCard1 = 0; // cards1번 인덱스
        int indexCard2 = 0; // card2 인덱스
        int indexGoal = 0; // Goal 인덱스
        while(indexGoal < goal.length){
            if(indexCard1 < len && cards1[indexCard1].equals(goal[indexGoal])){
                indexCard1++;
            }else if(indexCard2 < len2 && cards2[indexCard2].equals(goal[indexGoal]))
            {
                indexCard2++;
            }else{
                return "No";
            }
        indexGoal++;    
        }
        
        
        return answer;
    }
}