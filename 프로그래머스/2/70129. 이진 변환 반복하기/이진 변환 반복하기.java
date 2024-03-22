class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];  
        int zeroPoint = 0;
        int len = 0;
        // s가 1이 될때 까지        
        while(!s.equals("1")){
            for(char ch : s.toCharArray()){
            // 0을 뽑아낸 횟수 기록
                if(ch == '0') zeroPoint++;
            }
            // 원본길이 갱신
            len = s.length()-zeroPoint;
            answer[1] += zeroPoint;
            // 0 제거 후 길이 = 원본 길이 - 0을 뽑아낸 횟수
            s = Integer.toBinaryString(len);
            // 횟수 증가
            answer[0]++;
            // 0 발견횟수 초기화
            zeroPoint = 0;
        }     
        return answer;
    }
}