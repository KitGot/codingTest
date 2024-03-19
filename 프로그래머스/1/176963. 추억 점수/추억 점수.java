import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> map = new HashMap<>();
        // 이름 : 점수
        for(int i = 0;i<name.length;i++) map.put(name[i],yearning[i]);
        // photo 배열 순회
        for(int i = 0;i<photo.length;i++){
        int sum = 0;
        for(int j=0;j<photo[i].length;j++) sum += map.getOrDefault(photo[i][j],0);
        answer[i] = sum;
                // 있으면 그거 꺼내고 없으면 0 더하기           
        }
        return answer;
    }
}