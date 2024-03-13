import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int [] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != 0){
                // 주사위 번호 : 해당 번호가 나온 횟수로 저장
                map.put(i,arr[i]);
            }
        }
        // 키값 : 번호 를 배열로 변환
         Integer[] array = (map.keySet()).toArray(new Integer[0]);
            // key값 개수로 판별을 하되 2개일때 는 나눠서 생각 3개 1개 2개 2개
            // 1개일 때 즉 모두 같을때
        if(map.size() == 1) return a * 1111;
            // 번호 개수가 2개일 때
        if(map.size() == 2){
            // 나온 횟수가 1 :3 또는 3 : 1일때
            if(map.get(array[0]) == 1 || map.get(array[0]) == 3){
                int big = (map.get(array[0]) == 3) ? array[0] : array[1];
                int min = (map.get(array[0])!= 3) ? array[0] : array[1];
                return ((10 * big + min) * (10 * big + min));
            }
            // 나온 횟수가 2 : 2 일때
            if(map.get(array[0]) == 2){
                return (array[0] + array[1]) * (Math.abs(array[0] - array[1]));
                }
               return 0; 
        }
            // 키개수가 3개이고 겹치는게 2개 그리고 1개 1개
        if(map.size() == 3){
            for(int i = 0;i<array.length;i++){
            if(map.get(array[i]) == 2){
                map.remove(array[i]);
                array = (map.keySet()).toArray(new Integer[0]);
             }
            }
            
            return array[0] * array[1];
            
        }
                            
        if(map.size() == 4){
           int min = 6;
            for(int i = 0;i<array.length;i++){
                if(array[i] <= min){
                    min = array[i];
                }
            }
            return min;
            
        }
 
        return answer;
    
        
        }
}
