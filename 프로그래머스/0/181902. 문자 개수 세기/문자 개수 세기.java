import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        // 52 길이 배열 초기화
        int[] answer = new int[52];
        //char lowerCase = 'a'; // 98 z : 123
        //char upperCase = 'A'; // 65 Z : 90
        //System.out.println('Z' + 0);
       
        char[] arr = my_string.toCharArray();
        
        for(char ch : arr){
          if(ch > 'Z') continue;
          answer[ch-'A']++;  
        }
       for(char ch : arr){
           if(ch < 'a') continue;
           answer[ch-'a' + 26]++;
       } 
       
        
        
        return answer;
    }
}