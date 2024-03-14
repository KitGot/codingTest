class Solution {
    public int solution(String s) {
    String trans = "";
    String str = "";
        
    char array[] = s.toCharArray();
        
    for(int i = 0;i<array.length;i++){
        // 숫자일 때
        if(array[i] <= '9'){
        if(!trans.equals("")){
            str += change(trans) + "";
            trans = "";
        }
        str += array[i] + "";
        }
        // 문자일 때
        else if(array[i] >= 'a'){
            trans += array[i] + "";
            if(!change(trans).equals("")){
                str += change(trans) + "";
                trans = "";
            }
        }
    }
        
    return Integer.parseInt(str);
      
}
    public String change(String str){
        if(str.equals("zero")) return "0";
        else if(str.equals("one")) return "1";
        else if(str.equals("two")) return "2";
        else if(str.equals("three")) return "3";
        else if(str.equals("four")) return "4";
        else if(str.equals("five")) return "5";
        else if(str.equals("six")) return "6";
        else if(str.equals("seven")) return "7";
        else if(str.equals("eight")) return "8";
        else if(str.equals("nine")) return "9";
        else return "";
    }
}