/*
Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after operation.
Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!
Note: If the final string is empty, print Empty String .
Input: 
aaabccddd
Sample Output 0
abd
Sample Case 0
Steve can perform the following sequence of operations to get the final string:
aaabccddd → abccddd
abccddd → abddd
abddd → abd
Thus, we print abd.

 */

import java.util.*;

public class superReducedString {

    private static Scanner in;

	static StringBuffer super_reduced_string(String s){
        // Complete this function
    	StringBuffer a = new StringBuffer();
    	a.append(s);
        int flag ;
        while(a.length() > 1) {
        	flag = 0;
        	for(int i=0; i<= a.length()-2; i++) {
        		if(a.charAt(i) == a.charAt(i+1)) {a.deleteCharAt(i); a.deleteCharAt(i); flag = 1; i--;}
        		
        	}
        	if(flag == 0) {return a;}
        }
        if(a.length() == 0) {a.append("Empty String"); }//return a;
        //else if(s.length() == 1) {return a;}
		return a;
        
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        String s = in.next();
        StringBuffer result = super_reduced_string(s);
        System.out.println(result);
    }
}
   		
