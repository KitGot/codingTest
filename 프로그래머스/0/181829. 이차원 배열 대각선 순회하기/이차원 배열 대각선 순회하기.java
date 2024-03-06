class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        // 배열 순회
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                // 인덱스간  합 구하고 비교
        
                   // i + j <= k이면 합산
                answer += (i+j <= k) ? board[i][j] : 0;
            }
        }
                
        return answer;
    }
}