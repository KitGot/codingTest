import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean a = true;
        int[] past = Arrays.copyOf(arr,arr.length);
        boolean flag = false;
        
        // 계속 반복
        while(a){
        // 배열 순회
        for(int i = 0;i<arr.length;i++){
        // 조건에 맞게 배열 변환
        if(arr[i] < 50 && arr[i] % 2 != 0){
            arr[i] = arr[i] * 2 + 1;
            }else if(arr[i] >= 50 && arr[i] % 2 == 0){
            arr[i] = arr[i] / 2;
        }
        }
         // x번 반복했을때 바꾸기전 배열과 바꾼 배열이 같은 경우 x중 가장 작은거 리턴 
        flag = true;
          for(int i = 0;i<arr.length;i++){
            if(arr[i] != past[i]){
                flag = false;
                past = Arrays.copyOf(arr,arr.length);
                answer++;
                break;
            }
            }
            //
            if(flag){
            return answer;}
            
            
        }
        return answer;
}
    
}