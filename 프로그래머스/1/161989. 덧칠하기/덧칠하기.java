class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 칠했는지 확인 배열
        boolean check[] = new boolean[n+1];
        // 칠하는 인덱스
        int index = 0;
        // 만약 n 과 m이 같거나 section이 하나면 1리턴
        if(n == m | section.length == 1) return 1;
        
        // section 배열 순회
        for(int now : section){
            index = now;
            // 칠해져있으면 칠하지 않고 넘기기
            if(check[index]){
                continue;
            }else{
                // 칠하는 인덱스가 sectino 길이보다 크면 그냥 다칠해버리기
                if(index + m > n){
                    for(int i = index;i<check.length;i++) check[i] = true;
                }else{
            // 칠해져 있지 않다면 현재 인덱스 부터 m 만큼 칠하고 칠한 횟수 하나 추가
                for(int i = index;i < index + m;i++) check[i] = true;
                }
                answer++;
            }
        }
        return answer;
    }
}