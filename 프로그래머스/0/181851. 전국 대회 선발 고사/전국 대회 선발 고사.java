import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        // attendance가 false인거 거르고
        for(int i = 0;i<attendance.length;i++) {if(!attendance[i]) rank[i] = 101;}
        // rank가 100이 아닌거만 번호 넣고
        for(int num = 0;num<rank.length;num++)
        {
            if(rank[num] != 101){
            list.add(rank[num]); // 등수를 넣고
            map.put(rank[num],num); // 등수 : 인덱스 번호
        }
            }
        //  정렬 후 계산
        // list.sort((a,b) -> (a > b) ? -1 : 1);
        // 등수를 정렬
        list.sort(null);
        for(int n : list) System.out.print(n + " ");
        
        return map.get(list.get(0)) * 10000 + map.get(list.get(1)) * 100 + map.get(list.get(2));
    }
}