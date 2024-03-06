import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        n1 = n1.add(n2);
        return n1.toString();
            }
}