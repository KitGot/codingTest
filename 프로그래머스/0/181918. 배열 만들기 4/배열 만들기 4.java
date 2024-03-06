import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        // 변수 i 설정
        int i = 0;
            
        // i가 작을때 반복
        while(i < arr.length){       
            // 비면 추가
            if(stk.isEmpty()) stk.add(arr[i++]);
            else if(stk.get(stk.size()-1) < arr[i]) stk.add(arr[i++]);
            else if(stk.get(stk.size()-1) >= arr[i]) stk.remove(stk.size()-1);     
        }
        
        return stk.stream().mapToInt(a -> a).toArray();
    }
}