import java.util.*;
class Solution {
    public int solution(String t, String p) {
       // 비교값
        int answer = 0;
        long n = Long.parseLong(p);
        int first = 0;// 첫번째 인덱스
        int last = p.length();// 끝 인덱스
        long num;
        // t 길이만큼 반복해서 p길이만큼 짤라서 비교
        while(last <= t.length()){
            num = Long.parseLong(t.substring(first++,last++));
            if(num <= n){
                System.out.println(num);
                answer++;
            }
            }
            // 횟수 리턴
        return answer;
    }
}