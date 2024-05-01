import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer=0;
        long num = 1L;
        Set<Long> set = new HashSet<>();
        for(int n : arr)
            num *= n;
        // 약수 다박기
        for(long i  = 1; i<=Math.sqrt(num);i++){
            if(num % i == 0){
                set.add(i); 
                set.add(num / i);
            }
    
        }
        List<Long> arraylist = new ArrayList<>(set);
        arraylist.sort(null);
        // 약수 리스트 순회하면서 arr 요소 나눠떨어지면 그거 리턴
        boolean flag = true;
        for(long a : arraylist){
            for(int k : arr){
                if(a % k != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return (int)a;
            }
            flag = true;
        }
        return answer;
    }
}


