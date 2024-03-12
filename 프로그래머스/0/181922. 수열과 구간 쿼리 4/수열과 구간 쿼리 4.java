class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] array : queries){
            for(int i = 0 ; i < arr.length ; i++){
                if((i >= array[0] && i <= array[1]) && i % array[2] == 0) arr[i]++;
            }
        }
        
        return arr;
    }
}