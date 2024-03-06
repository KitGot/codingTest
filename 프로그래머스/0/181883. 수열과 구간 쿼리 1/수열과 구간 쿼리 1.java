class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries에서 하나씩 받기
        for(int array[] : queries){
        // queries에 원소 구간 만큼 인덱스에 값 하나씩 더하기
            for(int i = array[0];i<= array[1];i++){
                arr[i]++;
            }
        }
        return arr;
    }
}