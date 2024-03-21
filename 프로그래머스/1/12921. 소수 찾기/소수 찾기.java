import java.util.*;
class Solution {
    public int solution(int n) {
        int now = 2;
        int answer = 0;
        Set<Long> list = new HashSet<>();
        
        // n까지 for문
        while(now <= n){
        for(int i = 1;i<=Math.sqrt(now);i++){
            if(now % i == 0){
                list.add((long)now);
                list.add((long)i);
            }
            if(list.size() > 2) break;
        }
            if(list.size() == 2) answer++;
        list.clear();
        now++;
            
        }
        
        return answer;
    }
}