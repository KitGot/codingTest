class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum = 0;
        // 첫번쨰항이 true인 경우 answer에 초기값 더하고 included false
        if(included[0])
            answer = a;
            included[0] = false;
        //  일단 sum에 공차 더하고 true이면 합산
        for(int i =1;i<included.length;i++){
            sum += d;
            System.out.println(included[i]);
            System.out.println(i);
            System.out.println(sum);
        if(included[i]){
            answer += a;
            answer += sum;
        }
            
            
            
        }
        
        
        
        return answer;
    }
}