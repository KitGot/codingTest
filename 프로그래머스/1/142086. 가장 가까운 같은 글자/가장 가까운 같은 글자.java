import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        // s를 문자열 배열로 변환
        String[] str = s.split("");
        // map에 넣기 문자값 : 인덱스 값
        for(int i = 0;i<str.length;i++){
            // 넣을떄 해당 키가 없으면 answer에 -1 추가하고 map에 추가
            if(!map.containsKey(str[i])){
                answer.add(-1);
                map.put(str[i],i);
            }else{
            //해당 키값이 있으면 지금 인덱스에서 존재하는 인덱스 빼서 answer에 넣고 맵에 현재인덱스 초기화
                answer.add(i - map.get(str[i]));
                map.put(str[i],i);
            }
        }

        // 배열 리턴
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}