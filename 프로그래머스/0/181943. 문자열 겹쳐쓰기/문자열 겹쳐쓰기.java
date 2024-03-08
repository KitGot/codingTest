class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // 둘다 배열로 만들어놓고
        char[] mArray = my_string.toCharArray();
        char[] oArray = overwrite_string.toCharArray();
        // for문 s 부터 overwrite_string 길이만큼 반복하며 바꾸기
        for(int i = s;i<overwrite_string.length()+s;i++){
            mArray[i] = oArray[i-s];
        }
        // String 으로 리턴
        for(char c : mArray){
            answer += c;
        }
        return answer;
    }
}