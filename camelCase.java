import java.util.Scanner;

public class camelCase {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
        String s = in.next();
        /*
        int count = 1;
        for( int i = 0 ; i < s.length() ; i++ ) {
        		if( (int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90 ) {
        			count++;
        		}
        }
        System.out.println(count);   
	*/
        String[] a = null;
        for(int i=0;i<s.length();i++) {
        		a = s.split("[A-Z]"); 		
        }
        System.out.println(a.length);
	}
}
