import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        // query 배열 순회
         for(int i = 0; i < query.length;i++){
        // query의 값에 따라 값자르기
            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            }else{
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        // 리턴
        
        return arr;
    }
}