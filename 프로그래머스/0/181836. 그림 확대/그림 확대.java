import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        String[] answer2 = {};
        String parts = "";
        // 배열 순회
       for(int i = 0;i<picture.length;i++){
         for(char a : picture[i].toCharArray()){
        // 한줄을 k배후 그걸 k개 만들어서 배열에 넣기
         for(int j = 0; j<k;j++) parts += a;
         }
          for(int a = 0; a<k;a++) answer.add(parts);
             parts = "";
       }
    
        
        
        return answer.toArray(answer2);
    }
}