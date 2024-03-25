class Solution {
    // n은 구역의 개수
    // m은 룰러의 길이
    // section은 칠해야하는 구역을 배열형태
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 칠해진 구역 배열
        boolean[] flag = new boolean[n+1];
        int index = 0;
        // section이 하나거나 룰러의 길이랑 구역의 길이가 같으면 한번만에 가능
        if(n == m | section.length == 1) return 1;
        
        // section 배열 순회
        for(int sections : section){
            index = sections;
            if(flag[sections]){
                continue;
            }else{
                
            if(sections + m < flag.length){
                while(index < sections + m){
                    flag[index++] = true;
                }
            }else{
                while(index < flag.length) flag[index++] = true;
            }
                    
                answer++;
            }
        }
        
        return answer;
    }
}