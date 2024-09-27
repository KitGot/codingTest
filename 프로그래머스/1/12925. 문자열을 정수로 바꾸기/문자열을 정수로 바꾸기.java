import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
	    char[] array = s.toCharArray();
        // 없다면 그냥 변환 슛
        if(array[0] >= '0' && array[0] <= '9'){
            return Integer.parseInt(s);
        }else{
            for(int i = 1;i < array.length;i++){
                answer += array[i] + "";
            }
            if(array[0] == '-') answer = "-" + answer;
        }
        return Integer.parseInt(answer);
        
	}
}