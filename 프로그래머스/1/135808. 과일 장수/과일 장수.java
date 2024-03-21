import java.util.*;

class Solution {
    // k 가 최고점
    // m 이 포장하는 사과 개수
public int solution(int k, int m, int[] score) {
	int answer = 0;
    List<Integer> box = new ArrayList<>();
    // score을 내림차순으로 정렬
    Integer[] apples = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[] :: new);
    int index = 0;
    
    while(index < apples.length){
        box.add(apples[index++]);
        if(box.size() == m){
            answer += box.stream().mapToInt(t -> t).min().getAsInt() * m;
            box.clear();   
        }
        }
	return answer;
	}
}