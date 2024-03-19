class Solution {
    public long solution(long n) {
        long answer = 0;
        if(n == 1) return 4;
        if(n == 2) return -1;
        if(n == 3) return -1;
        // for문
        for(long i = 2;i<n;i++){
            // 조건확인
            if((long)(i * i) == n) return (long)((i+1) * (i+1)); 
            else if((long)(i * i) > n){return -1;}
        }
        
        
        
        
        return answer;
    }
}