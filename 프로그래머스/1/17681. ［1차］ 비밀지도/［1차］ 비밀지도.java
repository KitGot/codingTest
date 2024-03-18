import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        // 비트 연산 결과 배열 
        int[] result = new int[arr1.length];
        // 비트연산
        for(int i = 0;i<arr1.length;i++) result[i] = (arr1[i] | arr2[i]);
        // 2진수로 변환
        for(int i = 0;i < n ;i++){
            String an = "";
            // 1이면저거 넣고 패스
            if(result[i] == 1){answer[i] = "    #"; continue;};
            
            while(result[i] >= 2){
                // 벽이 아닐경우 " "
                if(result[i] % 2 == 0){
                    an = " " + an;
                    result[i] /= 2;
                    //벽 일경우 # 
                }else if(result[i] % 2 == 1){
                    an = "#" + an; 
                    result[i] /= 2;
                }       
            }
            // 몫처리
            if(result[i] == 0){an = " " + an;}
            else{an = "#" + an;}
            // 자릿수 처리
            while(an.length() != n){
                an = " " + an;
            }
            answer[i] = an;
        }
        
        
        return answer;
    }
}