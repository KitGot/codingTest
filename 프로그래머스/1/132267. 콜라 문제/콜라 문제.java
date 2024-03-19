class Solution {
    // a 가져다 줘야하는 병수
    // b 받는 병수
    // n 가진 병수
    
	public int solution(int a, int b, int n) {
		int answer = 0; 
        int na = 0;
        while(n >= a){
            na = n % a;
            n = (n / a) * b;
            answer += n;
            n = n + na;
        }
		return answer;
	}
}