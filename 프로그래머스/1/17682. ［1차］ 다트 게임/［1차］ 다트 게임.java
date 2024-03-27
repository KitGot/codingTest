import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // 점수 배열
        int point[] = new int[3];
        // 현재 가리키는 인덱스
        int index = 0;
        // 현재 점수 저장 배열
        char[] array = dartResult.toCharArray();
        for(int i = 0; i < point.length; i++){
        String num = "";
        //dartResult를 가리키는게 숫자가 아닐때까지 일단 이동하면서 저장
            while(array[index] >= '0' && array[index] <= '9'){
                num += array[index++];
            }
            int po = Integer.parseInt(num);
            if(array[index] == 'T'){
                po = po * po * po;
            }
            else if (array[index] == 'D'){
                po = po * po;
            }
            index++;
            // index 증가한게 길이보다 크면 break;
            if(index >= array.length){
                point[i] = po;
                break;
            }
            
            if(array[index] >= '0' &&  array[index] <= '9'){
                point[i] = po;
                continue;
            }else{
                if(array[index] == '#'){
                    point[i] = -po;
                }else if(array[index] == '*' && i == 0){
                    point[i] = po * 2;      
                }else if(array[index] == '*'){
                    point[i] = po * 2;
                    point[i-1] = point[i-1] * 2;  
                }
                index++;
            }
            if(index >= array.length) break;
        }
    
        
        return point[0] + point[1] + point[2];
    }
}