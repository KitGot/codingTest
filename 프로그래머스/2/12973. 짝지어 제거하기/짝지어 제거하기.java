import java.util.*;
class Solution
{
    //abc cba
    //aa bb
    public int solution(String s)
    {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<array.length;i++){
            if(stack.isEmpty()){
                stack.push(array[i]);
                continue;
            }
            if(stack.peek() == array[i]){
                stack.pop();
            }else{
                stack.push(array[i]);
            }
        }
        
        if(stack.size() == 0) return 1;
        return 0;
    }
}