import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries){
        List<Integer> min = new ArrayList<>();
        List<Integer> answer = new ArrayList<>(); 
        // queries 순회
        for(int[] query : queries){       
        // 배열 순회
        for(int i =0;i<arr.length;i++){
        // s,e 범위를 만족하고 최소값 찾기
        if((query[0] <= i) && (i <= query[1]) && (arr[i] > query[2])){
            min.add(arr[i]);
        }
        }
         // 비었으면 -1 넣기
        if(min.isEmpty()){
            answer.add(-1);
            continue;
        }
        // min 리스트에 넣고 오름차순 정렬후 맨첫번째꺼 answer에 넣기
         min.sort(null);
         answer.add(min.get(0));
         min.clear();
    }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
}