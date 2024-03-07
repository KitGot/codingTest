import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        // i 가 arr 길이보다 작을때까지 반복
        while(i < arr.length){
        // stk가 비었다면 stk에 원소 추가후 i 증가
            if(stk.isEmpty()){
                stk.add(arr[i++]);
                continue;
        // stk가 비지않고 stk 마지막 원소가 arr[i]와 다르면 stk 마지막에 arr[i]추가 i++;    
            }else if(!stk.isEmpty() && stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
        // stk가 비지않고 stk 마지막 원소가 arr[i] 와 같으면 stk의 마지막원소 제거후 i++
            }else if(!stk.isEmpty() && stk.get(stk.size()-1) != arr[i]){
                stk.add(arr[i++]);    
            }
        }
        
        // stk가 비었다면 빈배열 리턴
        if(stk.isEmpty()) return new int[]{-1};
        
        return stk.stream().mapToInt(Integer :: intValue).toArray();
    }
}