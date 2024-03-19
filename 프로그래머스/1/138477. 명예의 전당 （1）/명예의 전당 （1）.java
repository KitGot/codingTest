import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = 0; // 명예의 전당의 최소값
        // 명예의 전당 리스트
        List<Integer> list = new ArrayList<>();
        // score 배열 순회
        for(int i = 0;i<score.length;i++){
        // 리스트 사이즈가 k보다 작으면 명예의 전당에 넣기
        if(list.size() < k){
            list.add(score[i]);
        // 명예의 전당의 최소값 보다 크다면 명예의 전당에 넣고 원래있던 최소값 빼기
        }else if(min < score[i]){
            // 최소값 빼기
            list.remove(list.indexOf(min));
            //  score 명예의 전당에 넣기
            list.add(score[i]);
        }
        // 최소값 갱신
        min = list.stream().mapToInt(t -> t).min().getAsInt();
        
        answer[i] = min;
        }
        return answer;
    }
}