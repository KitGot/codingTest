class Solution {
    public int solution(int n) {
        if(n == 1) return 1;
        int answer = 0;
        int second = n;
        int first = 1;
        
        while(first < second){
            if(n % first == 0){
                second = n / first;
                if(second == first){ // 나눴을때 first == target이면 종료
                    answer += second;
                    return answer;
                }
                answer += second + first;
            }
                first++;            
        }
        return answer;
 }
}