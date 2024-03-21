import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sosu = new ArrayList<>();
        Set<Integer> list = new HashSet<>();
        
    for(int i =0; i < nums.length-2;i++){
        for(int j = i+1; j < nums.length-1;j++){
            for(int k = j+1; k < nums.length;k++){
                sosu.add(nums[i] + nums[j] + nums[k]);
            }
        }
    }
        for(int n : sosu){
            for(int i = 1;i <= Math.sqrt(n);i++){
                if(n % i ==  0){
                     list.add(n);
                     list.add(i);
                }
                
            }
            
            if(list.size() == 2){
                //System.out.println("소수 : " + n);
                answer++;
                }else{
                //System.out.println("소수 아님 : " + n);
                }
            list.clear();
            
        }
 
        return answer;
    }
}