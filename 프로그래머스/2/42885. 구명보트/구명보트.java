import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        int first = 0; // 첫번째 인덱스
        int last = people.length-1; // 마지막 인덱스
        
        // 오름차순 정렬
        Arrays.sort(people); 
        
        // 반복문
        while(first <= last){
            if(people[first]  + people[last] <= limit){
                // 조건을 만족한다면 첫번째 인덱스 증가, 마지막 인덱스 감소 구명보트 추가
                first++;
                last--;
                answer++;
                
            }else{
                // 그렇지 않으면 구명보트 증가후 마지막 인덱스만 감소
                last--;
                answer++;
                
            }
        }
        
        
        return answer;
    }
}