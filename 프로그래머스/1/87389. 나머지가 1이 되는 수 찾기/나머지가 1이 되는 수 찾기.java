import java.util.*;

class Solution {
    public int solution(int n) {
    int answer = n-1;
    return siu(answer);
    
        
   
        
        
    }
    public int siu(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<= Math.sqrt(n);i++){
            if(i * i == n){
                list.add(i);
                break;
            }
            if(n % i == 0){
                list.add(n / i);
                list.add(i);
            }
        } 
        Collections.sort(list);

        return list.get(1);
    }
}