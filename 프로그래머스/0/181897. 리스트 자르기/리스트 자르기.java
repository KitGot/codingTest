import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        // n값에 따라 작업 구분
        
        // 작업 처리
        switch(n){
            case 1 :
                return Arrays.copyOfRange(num_list,0,slicer[1]+1);
            case 2 :
                return Arrays.copyOfRange(num_list,slicer[0],num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
            case 4 : 
                 for(int i = slicer[0];i<=slicer[1];i=i+slicer[2]){
                     answer.add(num_list[i]);
                 }              
                
                
        }
        // 값 리턴
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}