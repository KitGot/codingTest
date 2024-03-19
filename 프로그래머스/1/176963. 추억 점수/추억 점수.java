import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i<name.length;i++) map.put(name[i],yearning[i]); // 이름 : 점수
        
        // photo 순회
        
        for(int i = 0;i<photo.length;i++){
            int sum = 0;
            for(int j = 0;j<photo[i].length;j++){
                if(map.containsKey(photo[i][j])) sum += map.getOrDefault(photo[i][j],0);
            }
            answer[i] = sum;
        }
        
        
        return answer;
    }
}