import java.util.Scanner;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        StringBuffer answer = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // A : 65 Z : 90
        // a : 97 z : 122
        String str = "";
        for(char ac : a.toCharArray()){
            if(ac >= 65 && ac <= 90){
                str += ac;
                answer.append(str.toLowerCase());
                str = "";
            }else if(ac >= 97 && ac <= 122){
                str += ac;
                answer.append(str.toUpperCase());
                str = "";
            };
        }
        System.out.print(answer.toString());
    }
}