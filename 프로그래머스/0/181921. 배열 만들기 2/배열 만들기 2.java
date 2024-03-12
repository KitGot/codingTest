import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
    String str = "";
    boolean flag = true;
    //결과 저장할 리스트
    List<Integer> list = new ArrayList<>();
    // l 부터 r 까지 순회
    for(int i = l;i <= r;i++){
    // l부터 r 까지 돌면서 "0"과 "5"로만 이루어진 정수들 리스트에 저장
        str = i + "";
    for(char ch : str.toCharArray()){
        // 0이나 5가 아니면 브레이크
        if(ch != '0' && ch != '5'){
            flag = false;
            break;
        }
    }
    if(flag){
            list.add(i);
            flag = false;
        }
        flag = true;
    }
    // 리스트가 비었다면 -1을 가진 배열 리턴 
    if(list.isEmpty()) return new int[]{-1};
    // 리스트를 배열로 리턴
    return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}