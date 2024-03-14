import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        
        Map<Character,List<String>> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        // 배열 순회
       for(int i = 0;i<strings.length;i++){
           char key = strings[i].charAt(n);
           // map에 키가있다면
           if(map.containsKey(key)){
               List<String> strlist = map.get(key);
               strlist.add(strings[i]);
                map.put(key,strlist);
           }else{
               // map에 키가 없다면
               List<String> str = new ArrayList<>();
               str.add(strings[i]);
               map.put(key,str);
               list.add(key);
           }
       }
        // 오름 차순 정렬
        list.sort(null);
        for(char key : list){
            List<String> strList = map.get(key);
            strList.sort((a,b) -> a.compareTo(b) < 0 ? -1 : 1);
            for(int i = 0;i<strList.size();i++){
                answer.add(strList.get(i));
            }
        }
        
       return answer.toArray(new String[0]); 
    }
}