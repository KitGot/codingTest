import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int point[] = new int[3]; // 점수 저장 배열
        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // answers 순회
        for(int i = 0;i<answers.length;i++){    
        // 1번 2번 3번 수포자 값 매겨서 맞으면 카운트 올리기
            if(n1[i % n1.length] == answers[i]) point[0]++;
            if(n2[i % n2.length] == answers[i]) point[1]++;
            if(n3[i % n3.length] == answers[i]) point[2]++;
        }    
        // 최대값 뽑아내기
        int max = -1;
        for(int i = 0;i<point.length;i++){
            if(max < point[i]){
                max = point[i];
            };
        }
        // 가장 많이 맞힌 사람 번호 출력
        for(int i = 0;i<point.length;i++){
            if(max == point[i]) list.add(i+1);
        }
        // 가장 많이 맞힌 사람이 동일하면 걔도 넣고 오름차순 정렬
        // 리스트 정렬
        list.sort(null);
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}