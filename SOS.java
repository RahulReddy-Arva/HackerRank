import java.util.*;

public class SOS {

    private static Scanner in;

	public static void main(String[] args) {
	        in = new Scanner(System.in);
	        String S = in.next().toUpperCase();
	        //String[] cipher = new String[nom];
	        int count = 0;
	        for(int i=0; i<=S.length()-3; i=i+3) {
	        	if(S.charAt(i) != 'S')count++;
	        	if(S.charAt(i+1) != 'O')count++;
	        	if(S.charAt(i+2) != 'S')count++;
	        }
	        System.out.print(count);
	        
	    }
}