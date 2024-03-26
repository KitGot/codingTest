import java.util.*;
class Solution {
        // 실패율 = 도달하고 클리어 못한 수 / 스테이지에 도달한 수
    public int[] solution(int N, int[] stages) {
        List<Integer> answer = new ArrayList<>();
        int visit = 0;
        int fail = 0;
        double failper = 0.0;
        // 실패율 : 번호(리스트) 맵 만들고
        HashMap<Double,List<Integer>> map = new HashMap<>();
        List<Double>  list = new ArrayList<>();
        // for문 N만큼
        for(int i = 1;i<=N;i++){
        // stages 순회하면서 N보다 큰 수는 스테이지에 도달한 수
            for(int stage : stages){
                if(i == stage) {fail++;visit++;}
                else if(i < stage){visit++;}
            }     
            if(visit == 0){
            if(!list.contains(0.0)){
                list.add(0.0);
            }
            List<Integer> arrayList = map.getOrDefault(0.0,new ArrayList<Integer>());
            arrayList.add(i);
            map.put(failper,arrayList);
            
            }else{
                
            failper = (double)fail/visit;
            if(!list.contains(failper)){
                list.add(failper);
            }
            List<Integer> arrayList = map.getOrDefault(failper,new ArrayList<Integer>());
            arrayList.add(i);    
            map.put(failper,arrayList);    
              
            }
            failper = 0.0;
            fail = 0;
            visit = 0;
        }
        list.sort((a,b) -> a > b ? -1:1);
        
        for(double n : list){
            List<Integer> listd = map.get(n);
            for(int num : listd) answer.add(num);
            
        }
        // 같은 실패율일경우 리스트형태로 저장할것이므로 괜춘하다
        return answer.stream().mapToInt(t -> t).toArray();
    }
}