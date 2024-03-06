class Solution {
    public int[][] solution(int[][] arr) {
        // 가로길이 세로길이 중 비교해서 가장큰길이 얻기
        int width = arr[0].length;
        int height = arr.length;
        int max = (height > width) ? height : width;
        // 큰길이로 정사각형 배열로 만들기
        int answer[][] = new int[max][max];
        // 그리고 arr 전체 순회해서 초기화 하기
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}