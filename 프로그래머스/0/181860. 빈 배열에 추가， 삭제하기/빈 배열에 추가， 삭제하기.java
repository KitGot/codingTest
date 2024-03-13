import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();
        
        for(int i = 0; i < arr.length;i++){
            if(flag[i]){
                for(int j = 0;j<arr[i] * 2;j++) answer.push(arr[i]);
            }else{
                for(int k = 0;k<arr[i];k++) answer.pop();
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}