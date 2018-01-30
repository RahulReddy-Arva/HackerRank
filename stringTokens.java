
import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        StringTokenizer st = new StringTokenizer(s,"!,?._'@ "); 
        System.out.println(st.countTokens()); 
        while (st.hasMoreTokens()) { 
            System.out.println(st.nextToken()); 
        }
        
        
        
        
        scan.close();

	}

}
