import java.util.*;
import java.io.*;
class Main{
    public static void main(String []args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken()));
    }
}