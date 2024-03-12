class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();
        // 배열 순회
        for(int i = 0; i < code.length(); i++) if(i % q == r) answer.append(code.charAt(i));
        // 0 부터 각 인덱스를 q로 나눔
        // 그 값이 r이면 answer에 추가
            
        return answer.toString();
    }       
}