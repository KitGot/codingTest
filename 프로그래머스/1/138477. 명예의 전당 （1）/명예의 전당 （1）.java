import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer>  answer = new ArrayList<>(); // 매주 최하위 순위 리스트
        List<Integer> list = new ArrayList<>();// 명예의 전당 리스트
        int min = 0;
        // k번만큼 score을 answer에 추가
        for(int i = 0;i<score.length;i++){
            // 명예의 전당 리스트 사이즈가 k보다 작으면 걍 넣고
            if(list.size() < k){
                list.add(score[i]);
                min = list.stream().mapToInt(t -> t).min().getAsInt();
                answer.add(min);
            }else{
                // top k에 score가 들어가지 못하면
                if(min > score[i]){
                    answer.add(min);
                    continue;
                }else{
                    // top k에 score가 들어가면 기존 꺼 삭제
                    list.remove(list.indexOf(min));    
                }
                list.add(score[i]);                   
                min = list.stream().mapToInt(t -> t).min().getAsInt();
                answer.add(min);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}