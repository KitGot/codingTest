class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char array[] = my_string.toCharArray();
        // queries 읽어 오기
         for(int[] query : queries){
            // 원소 별로 위치 바꾸기 스왑 연산
             int last = query[1];
             
             for(int i = query[0];i<=(query[1] + query[0])/2;i++){
                char temp = array[i];
                array[i] = array[last];
                array[last] = temp;
                last--;   
             }
    }
         for(char cha : array){
            answer += cha;
        }
        
        return answer;
}
    
    
}