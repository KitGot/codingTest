import java.util.*;
class Solution {
	public String solution(int a, int b) {
        int first = 0;
		String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        List<Integer> threeZero = new ArrayList<>();
        threeZero.add(4);
        threeZero.add(6);
        threeZero.add(9);
        threeZero.add(11);
        List<Integer> threeOne = new ArrayList<>();
        threeOne.add(1);
        threeOne.add(3);
        threeOne.add(5);
        threeOne.add(7);
        threeOne.add(8);
        threeOne.add(10);
        threeOne.add(12);
        int days = 0;
        // 월
        for(int i = 1;i<=a;i++){
        if(threeZero.contains(i)) days = 30;
        else if(threeOne.contains(i)) days = 31;
        else days = 29;
        // 일
        for(int j = 1;j<=days;j++){
        if(b == j & a == i){
            return answer[first % 7];
        }
            first++;
        }
        }
		return answer[0];
	}
}