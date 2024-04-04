class Solution{
    
public  int solution(int n) {
    	char[] array = Integer.toBinaryString(n).toCharArray();
    	char[] array2;
    	int result = 0;
    	int count = 0;
    	int compare = 0;
    	int now = n+1;
    	for (char c : array)if(c == '1') count++;
    
    	while(true) {
    		array2 = Integer.toBinaryString(now++).toCharArray();
    		for (char c : array2)if(c == '1') compare++;
    		if(compare == count && now > n) {
    			result =  Integer.parseInt(new String(array2),2);
    			break;
    		}
            compare = 0;
    	}
    	return result;          
    }
}