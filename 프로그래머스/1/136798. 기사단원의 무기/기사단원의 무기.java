import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int num = 1;
        Set<Integer> list = new HashSet<>();
        // 1부터 number까지 약수 구해서 리스트에 넣기
        while(num <= number){
            for(int i = 1; i <= Math.sqrt(num);i++){
                // 약수 이면 리스트에 넣고
                if(num % i == 0){
                    list.add(i);
                    list.add(num / i);
                }
        }
             // 약수개수가 limit보다 크다면 power을 answer에 추가하고 리스트를 추가해라    
            answer += ((list.size() > limit) ? power : list.size());
            list.clear();
            num++;
        } 
         return answer;
    }
}