import java.util.*;


public class caesarCipher {

    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        k = k % 26;
        String cipher = "";
        
        for(int i=0; i<s.length(); i++) {
        	if( ((int)s.charAt(i)>=65)  && ((int)s.charAt(i)<=90)) {
        		if((int)s.charAt(i)+k>90) {
        			cipher += (char)((int)s.charAt(i)+k-26);
        		}
        		else {cipher += (char)((int)s.charAt(i)+k);}
        	}
        	
        	else if( ((int)s.charAt(i)>=97)  && ((int)s.charAt(i)<=122)) {
        		if((int)s.charAt(i)+k>122) {
        			cipher += (char)((int)s.charAt(i)+k-26);
        		}
        		else {cipher += (char)((int)s.charAt(i)+k);}
        	}
        	else {cipher += s.charAt(i);}
        }
        System.out.println(cipher);
        
    }
}