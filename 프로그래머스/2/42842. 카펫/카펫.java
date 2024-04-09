class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int ywidth,yheight;
        int width,height;
        int total = brown + yellow;
        // 전체 약수
        int sqrt = (int)Math.sqrt(total);
        while(sqrt >= 1){
        // 전체 길이를 바탕으로 해서 가로 세로를 구한다
            if(total % sqrt == 0){
                height = sqrt;
                width = total / sqrt;
                // 노란색 절댓값
                int ysqrt = (int)Math.sqrt(yellow);
                while(ysqrt >= 1){
                    if(yellow % ysqrt == 0){
                            yheight = ysqrt;
                            ywidth = yellow / ysqrt;
                        if(width - 2 == ywidth && height - 2 == yheight){
                            answer[0] = width;
                            answer[1] = height;
                            return answer;
                            }
                        }
                 ysqrt--;
                }
        }    
        sqrt--;     
        }

        return answer;
    }
}