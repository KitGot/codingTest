class Solution {
  public String solution(String s) {
      String answer = "";
      // 공백으로 문자열 구분
      String[] str = s.split("");
      // 배열 순회
      int count = 0; 
      for(int j = 0;j<str.length;j++){
         // 각 인덱스 구별해서 짝수는 대문자 홀수는 소문자
          if(str[j].equals(" ")){
                answer += " ";
                   count = 0;
                   continue;
             }
           if(count % 2 == 0){  
               answer += str[j].toUpperCase();
               count++;
           }else {
               answer += str[j].toLowerCase();
               count++;
               };
          
          /*
          if(j == str.length-1) break;
          answer += " ";*/
      }    
      // 리턴
      /*if(s.length() != answer.length()){
       for(int i = 0 ;i < s.length() - answer.length();i++){
          answer += " "; 
       }   
          }*/
      
      return answer;
  }
}