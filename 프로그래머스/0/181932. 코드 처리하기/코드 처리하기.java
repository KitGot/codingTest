class Solution {
    public String solution(String code) {
        // mode가 0일때 false
        // mode가 1일때 true
        String ret = "";
        // 처음 mode는 0(false)
        boolean mode = false;
        // code를 처음 부터 하나씩 읽기
        char[] codeArray = code.toCharArray();
        for(int i =0;i<codeArray.length;i++){
        // code[idx]가 1인지 판별 처음 mode는 0이다.
            if(codeArray[i] == '1'){
                mode = !mode;
                continue;
            }
            // mode에 따라 answer에 값추가
            if(!mode){ // mode가 0일때 - false
                if(i % 2 == 0){
                    ret += codeArray[i];
                }
            }
            if(mode){
                if(i % 2 != 0){
                    ret += codeArray[i];
                }
            }
        }
        
        if(ret == null || ret.equals("")){
            return "EMPTY";
        }
        return ret;
    }
}