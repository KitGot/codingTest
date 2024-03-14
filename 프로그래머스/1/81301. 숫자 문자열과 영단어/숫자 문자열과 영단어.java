class Solution {
public int solution(String s) {
		int beforelen = 0;
		String answer = "";
		String check = "";
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (c >= '0' & c <= '9') {
				answer += c;
			} else {

				check += c;

				answer += checking(check);
				if (answer.length() > beforelen) {
					check = "";
				}
			}
			beforelen = answer.length();
		}

		return Integer.parseInt(answer);
	}

	public String checking(String str) {
		switch (str) {
		case "one":
			return "1";
		case "zero":
			return "0";
		case "two":
			return "2";
		case "three":
			return "3";
		case "five":
			return "5";
		case "four":
			return "4";
		case "six":
			return "6";
		case "seven":
			return "7";
		case "eight":
			return "8";
		case "nine":
			return "9";
		default:
			return "";

		}

	}
}