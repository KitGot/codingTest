class Solution {
    public int solution(int n) {
        char[] cArr = Integer.toBinaryString(n).toCharArray();
        int count1 = 0;
        int i = cArr.length-1;
        for(; i > 0; i--){
            if(cArr[i] == '1'){
                cArr[i] = '0';
                if(cArr[i-1] == '0'){
                    cArr[i-1] = '1';
                    break;
                };
                count1++;
            }
        }
        //나머지 연산
        int back = 0, pow2 = 1;
        for(;count1 > 0;count1--){
            back+=pow2;
            pow2*=2;
        }

        int front = 0;
        //01이 있다
        if(i == 0){
            front = (int)(Math.pow(2,cArr.length));
        }else{
            front = Integer.parseInt(new String(cArr),2);
        }
        return front + back;
        //뒤에서부터 1다음에 나온 0에 1을 넣고
        //그 뒤를 가장 작은
        //01이 있다
        //101 -> 110
        //1101 -> 1110
        //10101 -> 10110
        //101010 -> 101100
        //101011 -> 101101
        //1010110 -> 1011001
        //10011 -> 10101
        //101110 -> 110011

        //01이 없다
        //111 -> 1011
        //1110 10011
    }
}
