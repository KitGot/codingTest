import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer= "";
        // 참가자 명 : 나온 횟수
        Map<String,Integer> hash = new HashMap<>();
        // completion 완주자 에서 
        for(String str : completion) hash.put(str,hash.getOrDefault(str,0)+1);
        
        for(String str : participant) hash.put(str,hash.getOrDefault(str,0)-1);
        
        for(String str : hash.keySet()) if(hash.get(str) == -1) return str;
        
        return answer;
    }
}