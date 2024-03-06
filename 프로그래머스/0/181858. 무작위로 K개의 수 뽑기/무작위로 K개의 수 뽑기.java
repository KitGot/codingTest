import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(!set.contains(arr[i]) && list.size() < k){
                list.add(arr[i]);
            }
                set.add(arr[i]);
        }
        System.out.println(list.size());
        int count = k - list.size();
        if(list.size() < k){
            for(int i = 0 ;i<count;i++){
                list.add(-1);
            }
            
        }
        
        
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    } 
}