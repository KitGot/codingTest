import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();        
        // 2가있는 인덱스 탐색
        for(int i =0;i<arr.length;i++)if(arr[i] == 2) list.add(i);            
        // 리스트가 비었다면 -1 배열 리턴
        if (list.size() == 0) return new int[]{-1};
        if (list.size() == 1) return new int[]{2};
        // 리스트에서 첫번쨰부터 마지막 인덱스의 인덱스까지 arr요소를 리턴
        for(int i = list.get(0);i<=list.get(list.size()-1);i++) answer.add(arr[i]);
        // 배열로 바꿔서 리턴
        return answer.stream().mapToInt(Integer :: intValue).toArray();
    }
}