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
        // 실패율 리스트 
        List<Double>  list = new ArrayList<>();
        // for문 N만큼
        for(int i = 1;i<=N;i++){
        // stages 순회하면서 N보다 큰 수는 스테이지에 도달한 수
            for(int stage : stages){
                if(i == stage) {fail++;visit++;}
                else if(i < stage){visit++;}
            }     
            // 아무도 도달못했을때는 실패율이 0.0 이다
            if(visit == 0){
            // 실패율 리스트는 꺼내는 용도니까 같은 실패율이 있다면 넣지 않는다.
            if(!list.contains(0.0)){
                list.add(0.0);
            }
            List<Integer> arrayList = map.getOrDefault(0.0,new ArrayList<Integer>());
            arrayList.add(i);
            map.put(failper,arrayList);
            
            }else{
            // 실패율 계산
            failper = (double)fail/visit;
            // 실패율 리스트는 꺼내는 용도니까 같은 실패율이 있다면 넣지 않는다.
            if(!list.contains(failper)){
                list.add(failper);
            }
            List<Integer> arrayList = map.getOrDefault(failper,new ArrayList<Integer>());
            arrayList.add(i);    
            map.put(failper,arrayList);    
              
            }
            // 실패율,방문횟수,실패한 횟수 초기화
            failper = 0.0;
            fail = 0;
            visit = 0;
        }
        // 실패율 리스트 내림차순 정렬
        list.sort((a,b) -> a > b ? -1:1);
        // 맵에서 실패율 큰순으로 뽑기
        for(double n : list){
            List<Integer> listd = map.get(n);
            for(int num : listd) answer.add(num);
            
        }
        return answer.stream().mapToInt(t -> t).toArray();
    }
}